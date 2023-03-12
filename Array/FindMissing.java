import java.util.Arrays;
import java.util.Scanner;

public class FindMissing {
    public static void main(String[] args) {
        // System.out.println("sasa");
        // int arr[] = { 0, 1, 2, 3, 5 };
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        // extraArray(arr);

        // sumNaturalNum_SumArray(arr);

        sortThemlinearSearch(arr);
    }

    private static void sortThemlinearSearch(int[] arr) {
        // System.out.println(Arrays.sort(arr));

        // int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
           
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            //System.out.print(arr[i]);
        }
       //System.out.println(Arrays.toString(arr)); [0, 1, 2, 3, 4, 5, 6, 7, 9]
       for (int i = 0; i < arr.length; i++) {
        if(arr[i]!=arr[i]+1){
            System.out.print(arr[i]);??
        }
       }
    }

    private static void sumNaturalNum_SumArray(int[] arr) {
        // System.out.println("Enter n=> ");
        // Scanner in = new Scanner(System.in);
        int n = arr.length;
        int sumNatural = (n * (n + 1)) / 2;
        System.out.println("Sum of natural no => " + sumNatural);
        int sumArray = 0;
        for (int i = 0; i < arr.length; i++) {
            sumArray = sumArray + arr[i];
        }
        System.out.println("Sum of gievn Array =>" + sumArray);
        int diff = sumNatural - sumArray;
        System.out.println("Missing no is=> " + diff);
    }

    private static void extraArray(int[] arr) {
        System.out.println("Enter sorted array");
        int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr[i]) {
                System.out.println(arr1[i]);

            }
        }

    }
}
