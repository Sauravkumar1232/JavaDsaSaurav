//package Array;

import java.util.Arrays;

public class RotationByk {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // 45123
        int k = 3;
        k = k % arr.length;
        rotate(arr, 0, arr.length - 1);
        rotate(arr, 0, k - 1);

        rotate(arr, k, arr.length - 1);
    }

    private static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
