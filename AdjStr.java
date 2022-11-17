public class   AdjStr {
    static String adjacent(String str,int i){
        if(str.length()-1==i){
            return str;
        }
        if(str.charAt(i)==str.charAt(i+1)){
             return str.charAt(i)+"*"+adjacent(str,i+1);
        }else return str.charAt(i)+adjacent(str, i+1);
      //return str;
    }
    public static void main(String[] args) {
        //System.out.println("saurav");
        String str="xxyy"; //x*xy*y
        int i=0;
        String newstr="";
        String ans=adjacent(str,0);
        System.out.println(ans);

    }
} 