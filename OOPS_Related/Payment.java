class Payment {

    void pay(int amount) {
        System.out.println("Paid using wallet: " + amount);
    }

    void pay(int amount, String card) {
        System.out.println("Paid using card: " + amount);
    }

    void pay(int amount, String upi, int pin) {
        System.out.println("Paid using UPI: " + amount);
    }

    public static void main(String[] args) {
        Payment p = new Payment();

        p.pay(500);
        p.pay(1000, "Debit Card");
        p.pay(750, "UPI", 1234);
    }
}
