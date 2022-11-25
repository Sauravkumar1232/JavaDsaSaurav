import java.util.Scanner;

public class LaxicograpicOrder {
    static void printcount(int num){
        if(num==0){
            
            return;
        }
        System.out.println(num);
        printcount(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        //System.out.println("dICTIONARY");
       // Scanner in=new  Scanner(System.in);
        // int num=in.nextInt();
        // int x=in.nextInt();
        //System.out.println(printcount(5));
        printcount(5);
     }
}
