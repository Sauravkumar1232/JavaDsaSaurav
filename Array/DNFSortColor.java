import java.util.Arrays;

//DNF-Dutch National Flag/Sort Colors-HW,Leetcode-75-Sort 0,1 and 2 https:leetcode.com/problems/sort-colors/description/i/p:arr={0,1,1,1,0,0,2,2,1,0,1,0,2,2}o/p:{0,0,0,0,0,1,1,1,1,1,2,2,2,2}

public class DNFSortColor {

    public static void main(String[] args) {
         int[] arr = { 0, 1, 1, 1, 0, 0, 2, 2, 1, 0, 1, 0, 2, 2 };
        //int arr[] = { 2, 0, 1 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        // switch (arr[mid]) {
        // case 0:
        // swap(arr, arr[low], arr[mid]);
        // System.out.print(arr[low]+" "+arr[high]);
        // low++;
        // mid++;
        // break;
        // case 1:
        // mid++;
        // break;
        // case 3:
        // swap(arr, arr[mid], arr[high]);
        // high--;
        // break;
        // }
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                //System.out.print(arr[low] + arr[high]);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

    private static void swap(int[] arr, int i, int j) {
       // System.out.print(i + " " + j);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
//System.out.println(i +" "+j);
    }
}
