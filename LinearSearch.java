import javax.sound.sampled.BooleanControl;

public class LinearSearch {
    static boolean Search(int arr[], int key, int size, int i) {
        if (size == i) {
            return false;
        }
        if (arr[i] == key) {
            return true;
        }
        return Search(arr, key, size, i + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 5, 7, 4, 5 };
        int key = 7;
        int size = arr.length;
        int i = 0;
        boolean result = Search(arr, key, size, i);
        System.out.println(result);
    }
}
