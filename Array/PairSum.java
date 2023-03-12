// 7. Pair Sum / Two Sum (LC : 1) - HW
//     i/p : arr = {2,1,5,6,3,7}, k = 11
//     o/p : 2,3
//     pair is 5 and 6

// package Array;

class PairSum {
    public static void main(String[] args) {
        int[] arr = { 2, 10, 4, 3, 7, };
        int n = arr.length;
        int k = 5;
        int result = pairSum(arr, n, k);

    }

    private static int pairSum(int[] arr, int n, int k) {

        for (int i = 0; i < arr.length; i++) {
            // System.out.println(arr[i8]);
            int curr = arr[i];
            for (int j = 0; j < arr.length; j++) {
                int tar = curr + arr[j];
                if (tar == k) {
                    System.out.println(i + " " + j);
                    break;
                }
            }

        }
        return 0;
    }
}