import java.util.*;

public class UnionOfSet {
    public static void union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr1) {
            set.add(val);
        }
        for (int val : arr2) {
            set.add(val);
        }
        System.out.println(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int arr2[] = { 3, 4, 5, 6 };
        union(arr1, arr2);

    }
}
