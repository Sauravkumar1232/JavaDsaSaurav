import java.util.Arrays;

public class SortBinary {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1 };
        int n = arr.length;
        sort(arr);
    }

    private static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {

            while (arr[left] == 0) {
                left++;
            }
            while (arr[right] == 1) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
