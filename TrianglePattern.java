public class TrianglePattern {
   



    public static void main(String[] args) {
        int n = 5;
        line(n);

        // for (int i = 1; i <=5; i++) {
        // for (int j = 1; j <=5; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

    }

    static void line(int n) {
        if (n == 0) {
            return;
        }
        System.out.println();
        pattern(n);

        line(n - 1);

    }

    static void pattern(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        pattern(n - 1);

    }

}


