public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println(sol(str1, str2));
        bySort(str1,str2);

    }

    private static void bySort(String str1, String str2) {
            

    }

    private static boolean sol(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        final int CHAR = 256;
        int count[] = new int[CHAR];
        for (int i = 0; i < str1.length(); i++) {
          //  System.out.println(count[str1.charAt(i)]++);
          count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                return  tutyt;
            }
        }
        return true;

    }
}
