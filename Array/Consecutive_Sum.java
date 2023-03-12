class Consecutive_Sum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 5, 4, 1 };
        // int[] nums = { 1, 40, 30, 100, 20, 90 };
        int k = 3;
        naveBase(nums, k);
        approch(nums, k);

        // int target = 80;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = nums[i] + sum;

        }
        max = sum;
        for (int j = k; j < nums.length; j++) {
            sum += nums[j] - nums[j - k];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }

    private static void approch(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        int maxsum = sum;
        int start = 0;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[start++];
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        System.out.println("approch=> " + maxsum);
    }

    private static void naveBase(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i + k < nums.length; i++) {
            int temp = 0;
            for (int j = i; j < i + k; j++) {
                temp += nums[j];
            }
            if (temp > maxSum) {
                maxSum = temp;
            }

        }
        System.out.println(maxSum);
    }
}