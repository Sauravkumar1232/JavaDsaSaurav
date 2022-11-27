public class PallindromStr {
    // static boolean reverce(String name, int i, String newstr) {
    // if (name.length() == i) {
    // System.out.println(newstr);
    // // if(str==newstr){
    // // System.out.println("yes");;
    // // }
    // // else System.out.println("no");;
    // return true;
    // }
    // char currentchar = name.charAt(i);

    // newstr = currentchar + newstr;
    // return reverce(name, i + 1, newstr);

    // }

    // static boolean isPallindrom(String str, String newstr) {
    // if (str.equals(newstr)) {
    // return true;
    // } else
    // return false;
    // }

    // public static void main(String[] args) {
    // String str = ""saurav";
    // boolean isPallindrom=checkPallindrom(";
    // int i = 0;
    // String newstr = "";
    // boolean isPallindrom = reverce(str,i, "");
    // if (isPallindrom) {

    // System.out.println("yes");
    // } else
    // System.out.println("no");

    // }
    public static void main(String[] args) {
        String name = "ab";
        System.out.println(name.length());
        boolean isPallindrom = checkPallindrom(name, 0, name.length() - 1);
        if (isPallindrom) {
            System.out.println("yes");
        } else
            System.out.println("no");
    }

    private static boolean checkPallindrom(String str, int i, int j) {
        if (i > j) {
            return true;
        }
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        } else
            return checkPallindrom(str, i + 1, j - 1);
    }
}
