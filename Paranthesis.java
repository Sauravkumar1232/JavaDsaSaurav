import java.util.ArrayList;

public class Paranthesis {
    static ArrayList<String> genrate(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(result, "", 0, 0, n);
        return result;
    }

    static void helper(ArrayList<String> result, String str, int open, int close, int max) {
        if (str.length() == 2 * max) {
            result.add(str);
            return;
        }
        if (open < max) {
            helper(result, str + '(', open + 1, close, max);
        }
        if (close < open) {

            helper(result, str + ')', open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        System.out.println("456");
        System.out.println(genrate(3));
    }
}
