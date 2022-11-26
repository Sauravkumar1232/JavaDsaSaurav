public class Fib {
    static int fib(int num){
       
            if(num<0){
                return 0 ;
            }
            if(num==0){
                return 1;
            }
          int result=fib(num-1)+fib(num-2);   
          return result;
        }
    

    public static void main(String[] args) {
        int num = 2;
        System.out.println(fib(num));

    }
}
