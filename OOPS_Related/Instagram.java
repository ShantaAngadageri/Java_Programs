class Instagram {
    public static void send(String text) {
        System.out.println("Send only message: " + text);
    }

    public static void send(String uname, int id) {
        System.out.println("User name: " + uname + ", ID: " + id);
    }

    public static void send(String caption, long number) {
        System.out.println("Caption: " + caption + " " + number);
    }

    public static void main(String[] args) {
        send("Hello");
        send("Shanta", 101);
        send("Radhe Krishna", 264873837187L);
    }
}
