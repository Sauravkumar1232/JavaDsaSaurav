 
import java.util.Arrays;

public class DiffTwoArr {
    public static void main(String[] args) {
        int first[] = { 1, 2, 3, 4 };
        int second[] = { 1, 2, 3, 4 };
        int result[] = new int[first.length > second.length ? first.length : second.length];
        diffArray(first,second,result);
    }

    private static void diffArray(int[] first, int[] second, int[] result) {
        int carry=0;
        int sum=0;
        int i=first.length-1;
        int j=second.length-1;
        int k=result.length-1;
        while(k>=0){
            if(i>=0 && j>=0){
                sum=first[i]+second[j]+carry;
            }
            else if(i>=0 && j<0){
                sum=first[i]+carry;
            }
            else if(i<0 && j>=0){
                sum=second[j]+carry;
            }
            result[k]=sum%10;
            carry=sum/10;
        }
        System.out.println(Arrays.toString(result));

    }
}
