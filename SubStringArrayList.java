import java.util.ArrayList;

public class SubStringArrayList {
    // static ArrayList<String> getSubseq(String str){
    //     //base case
    //     if(str.length()==0){
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add("");
    //         return list;
     
    //     }
    //     char singlechar=str.charAt(0);
    //     String subString=str.substring(1);
    //     ArrayList<String> newlist=new ArrayList<>();
    //     ArrayList<String> list=getSubseq(subString);
    //     //old list traverse
    //     for(int i=0;i<list.size();i++){
    //         newlist.add(list.get(i));  //not include
    //         newlist.add(singlechar+list.get(i));  //include
    //     }
    //     return newlist;
    // }
    // public static void main(String[] args) {
    //     String str="abc";
    //     ArrayList<String> list=getSubseq(str);
    //     System.out.println(list);
    // }
    public static void main(String[] args) {
        String str="abc";

        getSubstr(str,"");
    }
    static void getSubstr(String str, String ans){
        if(str.length()==0){
           System.out.println(ans);
            return;
        }
        char currentchar=str.charAt(0);
        String remString=str.substring(1);

        getSubstr(remString, ans+currentchar);//include
        
        getSubstr(remString, ans); //exclude 
        
    }
}
