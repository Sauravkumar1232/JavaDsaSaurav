public class SayDigit {
    static void digit(int num, String arr[]) {
        if (num == 0) {
            return;
        }
        int temp = num % 10;
        num = num / 10;
       
        // System.out.println(temp);
        digit(num, arr);
        System.out.println(arr[temp]);
        // switch (temp) {
        // case 0:
        // System.out.println("zero");
        // break;
        // case 1:
        // System.out.println("one");
        // break;
        // case 2:
        // System.out.println("two");
        // break;
        // case 3:
        // System.out.println("three");
        // break;
        // case 4:
        // System.out.println("four");
        // break;
        // case 5:
        // System.out.println("five");
        // break;
        // case 6:
        // System.out.println("six");
        // break;
        // case 7:
        // System.out.println("seven");
        // break;
        // case 8:
        // System.out.println("eight");
        // break;
        // case 9:
        // System.out.println("nine");
        // break;
        // default:
        // break;
        // }

    }

    public static void main(String[] args) {
        // System.out.println("sau");
        int num = 421;
        System.out.println(num);
        String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        digit(num, arr);

    }
}
