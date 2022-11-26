public class BinarySearchbyRecur {
    static boolean isSorted(int[] arr, int size) {
        if (size == 0 || size == 1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        } else {
            boolean rem = isSorted( [arr + 1], size - 1);
            return rem;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 9, 5, 8, 7, 1 };
        int size = arr.length;
        System.out.println("size= " + size);
        if (isSorted(arr, size)) {
            System.out.println("sorted");
        } else
            System.out.println("not sorted");

    }
}
