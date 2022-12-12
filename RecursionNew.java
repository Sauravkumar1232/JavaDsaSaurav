public class RecursionNew {
    public static void main(String[] args) {
        System.out.println("saurav");
        int num=1234;
        System.out.println(countDigit(num));
    }
    static int countDigit(int num){
        if(num==0)
        return num;
       return  num%10+countDigit(+num/10);
        
    }
}
