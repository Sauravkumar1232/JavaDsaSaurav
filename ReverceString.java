public class ReverceString {
    // static String reverce(String str,String newstr,int i){
    //     if(str.length()==i){
    //         return newstr ;
    //     }
        
    //     char currentchar=str.charAt(i);
    //     System.out.println(currentchar);
        
        
    //     return  
    //     reverce(str, currentchar+newstr,i+1);
        
        
    // }
    // public static void main(String[] args) {
    //     String str="abcd";
    //     //int size=str.length();
    //     String newstr="";
    //     int i=0;
    //    System.out.println(reverce(str,newstr,i)); 
    // }
    public static void main(String[] args) {
        String str="abcd";
        int i=0;
        int j=str.length();
        reverce(str,i,j);
    }
    static void reverce(String str,int i,int j){
        if(i>j){
            return;
        }
        swap()
    }
}
