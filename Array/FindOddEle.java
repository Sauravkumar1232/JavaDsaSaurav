public class FindOddEle {
    public static void main(String[] args) {
        // int nums[] = { 2, 2, 1 };
        int nums[] = { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        System.out.println(ans);
    }

}
