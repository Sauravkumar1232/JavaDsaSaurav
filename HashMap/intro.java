import java.util.HashMap;
import java.util.*;

class intro {
    public static void main(String[] args) {
        System.out.println("Saurav HaspMap");
        HashMap<String, Integer> map = new HashMap<>();

        // insertion
        map.put("China", 1);
        map.put("India", 2);
        map.put("Pakistan", 3);
        System.out.println(map);
        map.put("India", 5);
        System.out.println(map); // map.put --->if exist then update else create new

        // // // Search
        // // if (map.containsKey("Indian")) {
        // // System.out.println("India is present");
        // // } else {
        // // System.err.println("Not present");
        // // }

        // //
        // System.out.println(map.get("China")); // if exist then key else
        // System.out.println(map.get("Loni")); // null

        // int arr[] = { 10, 20, 30 };
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }
        System.out.println("entry set");
        for (Map.Entry<String, Integer> e : map.entrySet()) { // entry set gives key and value both
            System.out.print(e.getKey());
            System.out.print(e.getValue());
        }

        System.err.println("------------------------------------------------");
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String kie : keys) {
            System.out.print(kie + " ");
        }

        map.remove("China");
        System.out.println(map.size());

        ///////////////////////////////////////////////////////
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(20);
        set.add(3);
        System.out.println(set);

        System.err.println("----------Iterator---------");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }

}