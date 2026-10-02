class CanteenBillingCounter {
    int itemPrice;
    int quantity;

    CanteenBillingCounter(int itemPrice, int quantity) {
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    int calculateBill() {
        return itemPrice * quantity;
    }

    void displayBill() {
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + calculateBill());
    }

    public static void main(String[] args) {
        CanteenBillingCounter bill =
                new CanteenBillingCounter(50, 3);

        bill.displayBill();
    }
}