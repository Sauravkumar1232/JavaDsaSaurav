import javax.xml.transform.Result;

public class ImpRec {
    // public static void main(String[] args) {
    // int num=5;
    // print(num);
    // }
    // static void print(int num){
    // if(num==0){
    // return;
    // }
    // System.out.println(num); // 5 4 3 2 1 time complexity o(n) space complexity=
    // o(n)
    // print(num-1);
    // System.out.println(num); // 1 2 3 4 5 function call finish then print number

    // int num = 1;
    // System.out.println(fact(num));

    // }

    // static int fact(int num) {

    // if (num == 0) {
    // return 1;
    // }

    // return num * fact(num - 1);
    // }

    // SUM OF N NUMBER
    // public static void main(String[] args) {
    // int num=5;
    // System.out.println(sum(num));;
    // }
    // static int sum(int num){
    // if(num==0){
    // return 0;
    // }
    // return num+sum(num-1);
    // }

    // SUM OF DIGIT OF NUMBER 1234 = 1 + 2 +3 + 4 = 10
    /**
     * @param args
     */
    public static void main(String[] args) {
        // int num=1234;
        // int sum=0;
        // int re=sumDigit(num,0);
        // System.out.println(re);
        // }
        // static int sumDigit(int num,int sum){
        // if(num==0){
        // // System.out.println();
        // return sum;
        // }
        // int digit=num%10;
        // System.out.println(digit);
        // // sum=sum+digit;
        // return sumDigit(num/10,sum+digit);
        int num = 1245;
        System.out.println(sumDigit(num));
    }

    static int sumDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumDigit(num / 10);
    }

}
