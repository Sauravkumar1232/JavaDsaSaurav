public class CountDigit {
    public static void main(String[] args) {
        int num = 1203;
        System.out.println(countDigit(num));

    }

    static int countDigit(int num) {
        return helper(num, 0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
