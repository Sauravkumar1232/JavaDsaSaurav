public class Powerof {
    static void power(int num){
        if(num==0){
            System.out.println(true); 
        }
         if(num>2){
            power(num/2);
        }
        //else System.out.println(false);
       // return true;
        
        
    }
    public static void main(String[] args) {
        //System.out.println("kajls");
        int num=32;
        //System.out.println(power(num));
        power(num);
    }
}
