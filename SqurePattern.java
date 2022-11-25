class SqurePattern {
    static void line(int num) {
        if (num == 0) {
            return;
        }
        System.out.print("");
        line(num - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        line(num);
        // System.out.println("(");
    }
}