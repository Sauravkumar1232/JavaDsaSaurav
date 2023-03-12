
//package Array;
//
import java.util.Arrays;

public class RotateArraybyOne {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr);
        webHelp(arr);
    }

    private static void webHelp(int[] arr) {
        {
            int i = 0, j = arr.length - 1;
            while (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            System.out.println(Arrays.toString(arr))????
        }
        
    }

    private static void rotate(int[] arr) {
        int last = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = last;

        System.err.println(Arrays.toString(arr));
    }
}
