public class BinarySearchbyRecur {
    // static boolean isSorted(int[] arr, int size) {
    //     if (size == 0 || size == 1) {
    //         return true;
    //     }
    //     if (arr[0] > arr[1]) {
    //         return false;
    //     } else {
    //         boolean rem = isSorted( [arr + 1], size - 1);
    //         return rem;
    //     }

    // }

    // public static void main(String[] args) {
    //     int arr[] = { 6, 9, 5, 8, 7, 1 };
    //     int size = arr.length;
    //     System.out.println("size= " + size);
    //     if (isSorted(arr, size)) {
    //         System.out.println("sorted");
    //     } else
    //         System.out.println("not sorted");

    // }
    public static void main(String[] args) {
        int arr[]={1,5,64,79,100};
        int target=5;
       int result= binarySearch(arr, target,0,arr.length-1);
    System.out.println(result);
    }

    private static int binarySearch(int[] arr, int target, int starting, int ending) {
        if(starting>ending){
            return -1;
        }
        int mid=starting+(ending-starting)/2;
        if(arr[mid]==target){
            return mid;
        }
if(target<arr[mid]){
    return binarySearch(arr, target, starting, mid-1);
}

    return binarySearch(arr, target, mid+1, ending);

    }
    
}
