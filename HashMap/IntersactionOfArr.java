import java.util.*;

public class IntersactionOfArr {
    public static void intersaction(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int val : arr1) {
            set.add(val);
        }
        // System.out.println(set);
        for (int val : arr2) {
            if (set.contains(val)) {
                count++;
                System.err.println(set);
                set.remove(val);
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 4, 3, 2, 1 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6 };
        intersaction(arr1, arr2);
    }
}

// 1-> convert any array to set for unique element
// 2-> check weather the element of second arrays will match with the set
// element
// 3-> if match then remove it from set to reduce again cheking and increse
// count by one