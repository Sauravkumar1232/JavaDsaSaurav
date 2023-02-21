import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        // int k = 3;
        // int len = nums.length;
        // System.out.println(Arrays.toString(nums));
        // // System.out.println(k = k % len);
        // // // System.out.println(nums[0]);
        // // int temp = nums[0];
        // // nums[0] = nums[k];
        // // nums[k] = temp;

        // // System.out.println(Arrays.toString(nums));
        // // rotation(nums, k);
        // // }

        // // private static void rotation(int[] nums, int k) {
        // // nums[0] = nums[k];
        // // System.out.println(nums);

        // for (int i = 0; i < k; i++) {
        // for (int j = 0; j < nums.length; j++) {

        // }
        // }
        // }
        int x = -123;
        if (x > 0) {
            int result = 0;
            while (x > 0) {
                int temp = x % 10;
                result = result * 10 + temp;
                x = x / 10;
            }
            System.out.println(result);

        } else {
            int result = 0;
            while (x > 0) {
                int temp = x % 10;
                result = result * 10 + temp;
                x = x / 10;
            }
            System.out.println("-" + result);
        }

    }
}