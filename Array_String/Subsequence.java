import java.util.ArrayList;

public class Subsequence {
    public static void solution(String str){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
         if(list.size()==0){
            list.add("");list.add(""+ch);
            continue;
         }   
         int n = list.size();
         for (int j = 0; j < n; j++) {
            String temp = list.get(j)+ch;
            if(!list.contains(temp)){
                list.add(temp);
            }
         }
        }System.out.println(list);
    }
    public static void main(String[] args) {
        String str="abc";
        solution(str);
    }
}
