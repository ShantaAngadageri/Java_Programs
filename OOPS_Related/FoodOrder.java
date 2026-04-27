class FoodOrder {

    void order(String item) {
        System.out.println("Ordered item: " + item);
    }

    void order(String item, int quantity) {
        System.out.println("Ordered " + quantity + " " + item);
    }

    void order(String item, int quantity, String address) {
        System.out.println("Order placed to address: " + address);
    }

    public static void main(String[] args) {
        FoodOrder f = new FoodOrder();

        f.order("Pizza");
        f.order("Burger", 2);
        f.order("Biryani", 1, "Bangalore");
    }
}