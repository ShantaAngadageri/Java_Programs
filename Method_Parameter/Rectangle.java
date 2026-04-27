class Rectangle {
    void area(int w, int h) {
        int res = w * h;
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Rectangle().area(8, 9);
    }
}
