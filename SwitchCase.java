import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int a;
        do {
            System.out.println("option 1 say hi");
            System.out.println("option 2 say hello");
            System.out.println("option 3 quit");
            System.out.println("enter choice");
            Scanner userInput = new Scanner(System.in);
            a = userInput.nextInt();

            switch (a) {
                case 1:
                    System.out.println("hi");
                    break;

                case 2:
                    System.out.println("hello");
                    break;

                case 3:
                    System.out.println("good by");
                    break;

                default:
                    System.out.println("invalid");
                    break;

            }
        } while (a != 3);
    }

}
