// package Array;

import java.util.Arrays;

class Max_Element {

    public static int approch1(int arr[], int n) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // System.out.println(max);

        return max;
    }

    public static int approch2(int arr[], int n) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 6, 20, 5, 8, 7, 4, 5 };
        int n = arr.length;
        System.out.println("Approch 1=> " + approch1(arr, n));
        System.out.println("Approch 2=> " + approch2(arr, n));
        approch3(arr, n);
    }

    private static void approch3(int[] arr, int n) {
        boolean isMax;
        for (int i = 0; i < arr.length; i++) {
            isMax = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    isMax = true;
                    break;
                }
            }
            if (isMax)
                System.out.println("Approch 3=> " + arr[i]);
        }

    }
}