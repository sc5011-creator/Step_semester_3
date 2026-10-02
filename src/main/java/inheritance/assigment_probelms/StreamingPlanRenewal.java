import java.time.LocalDate;
import java.util.Scanner;

abstract class Subscription {
    String name;
    LocalDate startDate;

    Subscription(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract LocalDate getRenewalDate();
}

class BasicPlan extends Subscription {
    BasicPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(30);
    }
}

class StandardPlan extends Subscription {
    StandardPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(90);
    }
}

class PremiumPlan extends Subscription {
    PremiumPlan(String name, LocalDate startDate) {
        super(name, startDate);
    }

    LocalDate getRenewalDate() {
        return startDate.plusDays(365);
    }
}

public class StreamingPlanRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());

            Subscription subscription;

            if (type.equals("BASIC")) {
                subscription = new BasicPlan(name, date);
            } else if (type.equals("STANDARD")) {
                subscription = new StandardPlan(name, date);
            } else {
                subscription = new PremiumPlan(name, date);
            }

            System.out.println(subscription.name + ": " +
                    subscription.getRenewalDate());
        }

        sc.close();
    }
}