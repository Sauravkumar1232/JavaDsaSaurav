import java.util.HashMap;
import java.util.Map;

public class MajorElement {
    public static void main(String[] args) {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
        int count = 0;
        int halfLen = nums.length / 2;
        System.out.println(halfLen);
        sirApp(nums);
    }

    private static void sirApp(int[] nums) {
        int count = 0;
        int majority = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                majority = nums[i];
            }
            if (majority == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(count);
    }

    private static void usingHashmap(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
            if()
        }
    }

    private static void myApp(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int curremt = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                // if
            }
        }
    }
}
