public class PatternMatching {
    public static void main(String[] args) {
        String str = "A BCABCD";
        String pat = "ABC";
        for (int i = 0; i < str.length() - pat.length(); i++) {
            int j;
            for (j = 0; j < pat.length(); j++) {
                if (pat.charAt(j) != str.charAt(i + j)) {
                    break;
                }

            }
            if (j == pat.length()) {
                System.out.println(i);
            }
        }
    }
}
