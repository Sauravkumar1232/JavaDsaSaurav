public class nBonacci {
    public static void main(String[] args) {
        int n = 4;
        int m = 11;
        bonaciSeries(n, m);
        slidingWindow(n, m);
    }

    private static void slidingWindow(int n, int m) {
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = 0;
        }
        arr[n - 1] = 1;
        arr[n] = 1;

        // sliding Window
        for (int i = n+1; i < m; i++) {
            arr[i] = 2 * arr[i - 1] - arr[i - n - 1];
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bonaciSeries(int n, int m) {
        int arr[] = new int[m];
        arr[n - 1] = 1;
        for (int i = n; i < m; i++) {
            for (int j = i - n; j < i; j++) {
                // arr[i] += arr[j];

                arr[i] = arr[i] + arr[j];
            }
        }
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
