class Sector {
    static void area(int r, int angle) {
        double area = (angle / 360.0) * 3.14 * r * r;
        System.out.println(area);
    }

    public static void main(String[] args) {
        area(7, 60);
    }
}
