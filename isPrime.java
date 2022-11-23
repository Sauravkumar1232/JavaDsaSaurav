public class isPrime {
    static boolean prime(int n,int i){
        if(n<=2){
            return (n==2)?true:false;
        }
        if(n%i==0){
            return false;
        }
       if (i*i>n){
        return true;
       }
       return prime(n, i+1);
    }
    public static void main(String[] args) {
        int num=2;
        int i=2;
        if(prime(num,i)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}
