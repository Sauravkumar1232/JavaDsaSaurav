import java.util.HashMap;

public class Count_distinct_element {
    public static void main(String[] args) {
        System.out.println("sasas");
        int nums[] = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;

        countDistinct(nums, k);
    }

    private static void countDistinct(int[] nums, int k) {
        // creating empty hash map
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // Traverse the first window and store count of every element in haspMap
        for (int i = 0; i < k; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // print count of first window
        System.out.println(hm.size());

        // traverse through the remaining array
        for (int i = k; i < nums.length; i++) {

            // remove the first element of first window
            // if there was only one occurence
            if (hm.get(nums[i - k]) == 1) {
                hm.remove(nums[i - k]);
            }

            // reduce count of the removed element
            hm.put(nums[i - k], hm.get(nums[i - k]) - 1);

            // add new wlwelement of current window
            // if this element appeard first time
            // set its count as 1
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

            // print count of curent window
            System.out.println(hm.size());
        }

    }
}
