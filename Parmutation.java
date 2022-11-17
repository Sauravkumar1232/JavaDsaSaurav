public class Parmutation {
    public static void parmutation(String str, int starting, int ending) {
        if (starting == ending) {
            System.out.println(str);
        } else {
            for (int i = starting; i <= ending; i++) {
                str=swap(str,starting,i);
                parmutation(str,starting+1,ending);
                str=swap(str,starting,i);

            }
        }
    }
    public static String swap(String str,int starting,int ending) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[starting];
        charArray[starting] = charArray[ending];
        charArray[ending] = temp;
        return String.valueOf(charArray);
        
    }

    public static void main(String[] args) {
        String str = "abc";
        int len = str.length();
        parmutation(str, 0, len - 1);
    }
}
