public class Binary_Search {
    public static void main(String[] args) {
        
        int arr[] = { 10, 12, 15, 17, 19, 20, 25, 27, 30, 35, 40 };
        int arr[]  = {5,7,7,8,8,10};
        int arr[]=
        int n = arr.length;
        int high = n - 1;
        int low = 0;
        int mid = 0;
        int search = 200;
        while (low < high) {
            mid = (low + high) / 2;
            if (search == arr[mid]) {
                System.out.println("Element found");
                int startIndex = 
                return;
            }
            if (search > arr[mid]) {
                low = mid + 1;

            } else if (search < arr[mid]) {
                high = mid - 1;
            }
        }
        System.out.println("element not found");

    }
}
