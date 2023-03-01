package Array;

//Span of an array - HW
//- find the difference b/w max and min element of an array


public class SpanofArray {
    public static void main(String[] args) {
        int arr[] = { 2,  5, 7, 9, 11 };
        int n = arr.length;
       int max =  maxElement(arr,n);
        int min = minElement(arr,n);
        System.out.println("Span of the array is => "+span(max,min));
    }

    private static int span(int max, int min) {
       
        return max-min;
    }

    private static int minElement(int[] arr, int n) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
           
            if (arr[i]>max) {
                max=arr[i];
                
            }
          } System.out.println(max);
        return max;
    }

    private static int maxElement(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min) {
                min=arr[i];
                
            }
        }
        System.out.println(min);return min;
    }
}
