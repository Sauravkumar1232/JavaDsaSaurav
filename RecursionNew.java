public class RecursionNew {
public static void main(String[] args) {
   //recerce a number
   int num=12003054;
   int rev=0;
   int count=0;
   //int result=revNum(num);
   //System.out.println(result);
    while(num!=0){
    int rem=num%10;
    if(rem==0){
        count++;
    }
    rev=rem+rev*10;
num =num/10;
   }
   System.out.println(count);
   System.out.println(rev);
}
//static int revNum(int num){
    // if(num==0){
    //     return num;
    // }
    //  int rem=num%10;
    // //  rev=rem*10+rem;
    // return  (rem)*10+revNum(num/10);
}

