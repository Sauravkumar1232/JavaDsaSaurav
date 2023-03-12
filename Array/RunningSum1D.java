import java.util.Arrays;

class RunningSum1D {
    public static void main(String[] args) {
        // System.out.println("sasa");
        int nums[] = { 1, 2, 3, 4 };

        int result[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            result[i] = sum;

        }
        System.out.println(Arrays.toString(result));
    }

}