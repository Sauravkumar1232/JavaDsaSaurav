import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, 6 };
        int target = 4;
        int result = linearSearch(arr, target, 0);
        System.out.println( arr.length - 1);
        System.out.println(ispresent(arr, target, 0));
        System.out.println("Element is found at index from starting = " + result);
        System.out.println("Element is found at index from lasting = " + searchfromlast(arr, target, arr.length - 1));
        findallindexces(arr, target, 0);
        System.out.println(list);
        // ArrayList<Integer> list1=findallindexces(arr, target, 0,new ArrayList<>());
        // System.out.println(list1);
    }

    private static boolean ispresent(int[] arr, int target, int i) {
        if (i == arr.length) {
            return false;
        }
        return arr[i] == target || ispresent(arr, target, i + 1);
    }

    private static int linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println("not found");
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return linearSearch(arr, target, index + 1);
    }

    private static int searchfromlast(int[] arr, int target, int j) {
        if (j == -1) {
            System.out.println("not found");
            return -1;
        }
        if (arr[j] == target) {
            return j;
        }
        return searchfromlast(arr, target, j - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    private static void findallindexces(int[] arr, int target, int index) {
        if (index == arr.length) {
            System.out.println("not found");
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findallindexces(arr, target, index + 1);
    }

    private static ArrayList<Integer>  findallindexces(int[] arr, int target, int index,ArrayList<Integer> list) {
        if (index == arr.length) {
             System.out.println("not found");
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
<<<<<<< HEAD
         return findallindexces(arr, target, index + 1, list);   // here list variables are different reference variables although they have same name
    }

    private static ArrayList<Integer>  findallindexces2(int[] arr, int target, int index) {
       ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length) {
             System.out.println("not found");
            return list;
        }
        //This will conatin answer fot that function call only
        if (arr[index] == target) {
            list.add(index);
        }
         return findallindexces2(arr, target, index + 1);    //here list variables are different reference variables although they have same name
=======
         return findallindexces(arr, target, index + 1, list);    //here list variables are different reference variables although they have same name
>>>>>>> ee1233054f652b86475284e3d5042417ca2bd247
    }

}
