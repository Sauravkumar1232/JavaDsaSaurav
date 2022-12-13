public class ArrayIsSorted {
    public static void main(String[] args) {
        int arr[]={1,2,30   ,4};
        boolean result=sorted(arr,0);
        System.out.println(result);
    }
    static boolean sorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        // if(arr[i]<arr[i+1]&&sorted(arr, i+1)){
        //     return true;
        // }
        return (arr[i]<arr[i+1]&&sorted(arr, i+1));
    }
}
