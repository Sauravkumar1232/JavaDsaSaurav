package Array;

public class LeaderElement {
    public static void webHelp(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j])
                    break;
            }
            if (j == n) {
                System.out.print(arr[i] + " ");??????/
            }
        }

    }

    public static void leader(int arr[], int n) {
        int k = 0;
        int i;
        for ( i = 0; i < n; i++) {
           int temp=arr[i];
            boolean flag = false;
            if (temp < arr[i + 1]) {
                flag = true;
               
                break;
            }k++;

        }
        if (i == n) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 17, 4, 3, 5, 2 };
        int n = arr.length;
        System.out.println("length " + n);
        leader(arr, n);
        webHelp(arr, n);
    }

    // private static void leader(int[] arr, int n) {
    // int temp = arr[0];
    // int k = 0;
    // while (k != arr.length - 1)
    // for (int i = 0; i < arr.length - 1; i++) {
    // if (temp < arr[i + 1]) {
    // temp = arr[i + 1];
    // // System.out.println(arr[i]);
    // System.out.println(temp);
    // k++;
    // }
    // }

}
