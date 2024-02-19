class Running_Length_Encoding{
    public static void main(String[] args) {
        String str="aabbbcdddd";
        // System.out.println(str.charAt(2));

        int count=1;
        String result="";
       for (int i = 0; i < str.length(); i++) {
     //   char ch = str.charAt(0);
     count=1;

     while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) )
       {
        count++;i++;
       }

        result+=str.charAt(i)+count;
       }System.out.print(result);
    }
}