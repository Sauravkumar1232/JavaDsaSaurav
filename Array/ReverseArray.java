package Array;

import java.util.Arrays;

// Two Pointer Approach
// 6. Reverse an array
//     i/p : arr = [1,9,13,4,15,6]
//     o/p : [6,15,4,13,9,1]

class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {6,15,4,13,9,1};
        reverse(arr);
        printRev(arr);
    }

    private static void printRev(int[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+",");
            
        }
        System.out.println(" ");
    }

    private static void reverse(int[] arr) {
       int start=arr[0];int end = arr[arr.length-1];
        while (start<end) {
            int temp = start;
            start=end;
            end=temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
}