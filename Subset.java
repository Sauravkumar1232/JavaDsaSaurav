import java.util.ArrayList;

public class Subset {
   // static void  subString(String str,int i,int n,String newstr){
    //     if(n==i){
            
    //             //System.out.println(newstr);
    //         return;
    //     }
        
    //     subString(str, i+1, n, newstr);
    //     newstr=str.charAt(i)+newstr;
    //     System.out.println(newstr);
    //     subString(str, i+1, n, newstr);
        
    // }
    // public static void main(String[] args) {
    //     //int arr[]={1,2,3};
    //    // int i=0;
    //    String str="abc";
    //     String newstr="";
    //     subString(str,0,str.length(),newstr);
    // }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer> output;
        int index=0;
        ArrayList<Integer> ans;
        
        System.out.println(subSet(arr[],index,output,ans));
    }
    static void subSet()
}
