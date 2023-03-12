public class BuyAndSellStock {
    public static void main(String[] args) {
        int input[] = { 7, 6, 5, 3 };
        int n = input.length;
        navApp(input, n);
        app2(input,n);

    }

    private static void app2(int[] input, int n) {
        int max=0;
        int i=0;
        int j=input.length-1;
       while()
    }

    public static void navApp(int input[], int n) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
             //   int diff = input[j] - input[i];
                if (max < input[j] - input[i])
                    
                max = input[j] - input[i];

            }
        }
        System.out.println(max);

    }
}
