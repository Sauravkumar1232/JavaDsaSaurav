class CountOddinArray {
    public static void main(String[] args) {
       // int arr[] = { 2, 2, 1 };
        int arr[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        count(arr);
    }

    private static void count(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }
}