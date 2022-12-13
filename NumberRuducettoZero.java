public class NumberRuducettoZero {
    public static void main(String[] args) {
        System.out.println("sadasd");
//int count=0;
        int num=4;
        System.out.println(reduce(num));
       

    }
    static int reduce(int num){
        return helper(num,0);
    }
    static int helper(int num,int count){
        if(num==0){
            return count;
        }
        if(num%2==0){
             return helper(num/2, count+1);
        }
       return helper(num-1, count+1);
    }
}
