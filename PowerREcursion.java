public class PowerREcursion {
    public static void main(String[] args) {
        int power=1;
        int number=3;
        System.out.println(calPower(power,number)); 
    }
    static int  calPower(int power,int number){
        if(number==0)
        return 1;
        if(power==0){
            return 1;
        }
        int result=number*calPower(power-1, number);
        return result;
    }
}
