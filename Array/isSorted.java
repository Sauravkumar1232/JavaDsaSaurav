package Array;

public class isSorted {
    public static void main(String[] args) {
        int arr[] = { 10, 500, 70, 90, 110 };
        int n = arr.length;
        System.out.println(sorted(arr, n));
    }

    private static boolean sorted(int[] arr, int n) {
        boolean flag;
        for (int i = 1; i < n; i++) {
            // flag = false;
            if (arr[i] < arr[i - 1]) {
                return false;
            }

        }

        return true;
    }
}
