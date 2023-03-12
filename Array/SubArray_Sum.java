public class SubArray_Sum {
    public static void main(String[] args) {
        // int nums[] = { 1, 1, 2 };
        int nums[] = { 1, 40, 30, 10, 20, 5 };
        int count = 0;
        int k = 3;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {
                sum = nums[i] + nums[j];

                //if (sum) {
                    // System.out.println(sum);
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}
