//package Array;

import java.util.Arrays;

public class SecondMax {

    public static void secondMaxApp1(int arr[], int n) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int re = arr[arr.length - 2];
        System.out.println("second largest" + re);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 50, 70, 9, 11 };

        int n = arr.length;
        secondMaxApp1(arr, n);
        secondMaxApp2(arr, n);
        webHelp(arr, n);
    }

    private static void webHelp(int[] arr, int n) {
        int largest, second;
        if (arr[0] > arr[1]) {
            largest = arr[0];
            second = arr[1];
        } else {
            largest = arr[1];
            second = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (largest < arr[i]) {
                second = largest;
                largest = arr[i];
            } else if (second < arr[i]) {
                second = arr[i];
            }
        }
        System.out.println("Largest " + largest);
        System.out.println("Second " + second);
    }

    private static void secondMaxApp2(int[] arr, int n) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            // if(max)
        }
        System.out.println(max);
    }
}
