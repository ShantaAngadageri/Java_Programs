class Trapezoid {
    static void area(int a, int b, int h) {
        double area = 0.5 * (a + b) * h;
        System.out.println(area);
    }

    public static void main(String[] args) {
        area(6, 10, 4);
    }
}
