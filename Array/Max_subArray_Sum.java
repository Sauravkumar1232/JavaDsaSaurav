public class Max_subArray_Sum {
    public static void main(String[] args) {
        int nums[] = { 5, 4, -1, 7, 8 };
        int maxSum = 0;
    
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                //sum = sum + nums[i] + nums[j];
               sum += nums[j];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
