import java.util.Arrays;

public class AdditionOfTwoArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4 };
        int arr2[] = { 5, 6, 7, 8 };
        int carry = 0;

        sumArr(arr1, arr2, carry);
        arrSum(arr1, arr2, carry);

    }

    public static void sumArr(int arr1[], int arr2[], int carry) {
        int arr3[] = new int[arr1.length];
        for (int i = 0, j = 0, k = 0; i < arr1.length; i++, j++, k++) {
            arr3[k] = arr1[i] + arr2[j];
        }
        System.out.println(Arrays.toString(arr3));

    }

    public static void arrSum(int arr1[], int arr2[], int carry) {
        int result[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        int i = arr1.length - 1;
        int j = arr1.length - 1;
        int k = arr1.length - 1;
        int sum=0;
        while(k>=0){
            if(i>=0 && j>=0){
                sum = arr1[i]+arr2[j]+carry;
            }
            else if(i>=0 && j<0){
                sum = arr1[i]+sum;
            }
            else if(j>=0 && i<0){
                sum=arr2[j]+carry;
            }
            result[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        System.out.println(Arrays.toString(result));
    }
}
