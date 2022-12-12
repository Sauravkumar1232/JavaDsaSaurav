import java.util.Scanner;

public class Recursionpre {
    // public static void main(String[] args) {
    // System.out.println("Hello Java main");
    // msg1();
    // }

    // static void msg1() {
    // System.out.println("Hello java1");
    // msg2();
    // }

    // static void msg2() {
    // System.out.println("Hello java2");
    // msg3();
    // }

    // static void msg3() {
    // System.out.println("Hello java3");
    // msg4();
    // }

    // static void msg4() {
    // System.out.println("Hello java4");

    // }

    // print 1 to 5
    // //1 2 3 4 5
    // public static void main(String[] args) {
    // Scanner in=new Scanner(System.in);
    // int num=in.nextInt();
    // print1(num);

    // }
    // static void print1(int num){
    // System.out.println(num);
    // print2(2);

    // }
    // static void print2(int num){
    // System.out.println(num);
    // print3(3);
    // }
    // static void print3(int num){
    // System.out.println(num);
    // print4(4);
    // }
    // static void print4(int num){
    // System.out.println(num);
    // }
    // public static void main(String[] args) {
    // print(1);

    // }
    // static void print(int num){
    // if(num==5){
    // System.out.println(num);
    // return;
    // }
    // System.out.println(num);
    // print(num+1);

    // }

    // 3---> Fibonacci number
    public static void main(String[] args) {
        int num=50;
        System.out.println(printfib(num));;
    }

    static int printfib(int num){
        // if(num==0||num==1){
           
        //     return ;
        // }
        // int result1=printfib(num-1)  ;
        // int result2=printfib(num-2);
        // int result=result1+result2;
        if(num<2){
            return num;
        }
        return printfib(num-1)+printfib(num-2);
    }
}
