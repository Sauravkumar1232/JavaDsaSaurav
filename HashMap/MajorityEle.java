import java.util.HashMap;

public class MajorityEle {
    public static void majorityEle(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 5, 1, 3, 1, 5, 1, 5, 5 };
        majorityEle(nums);
    }
}
