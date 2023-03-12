// package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;

class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 3, 4, 4, 7, 10 };
        int n = arr.length;
        removedup(arr, n);
        int count = sir_Approch(arr, n);
        System.out.println(count);
        approch3(arr, n);
    }

    private static void approch3(int[] arr, int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }
        System.out.println(set);
    }

    private static int sir_Approch(int[] arr, int n) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        return j + 1;
    }

    private static void removedup(int[] arr, int n) {
        boolean flag = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1]) {
                flag = true;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];

                }
            }
        }
        if (flag == true) {

        }
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");

        }
        System.out.println();

    }
}