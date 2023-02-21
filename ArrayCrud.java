
import java.util.Scanner;

class ArrayCrud {

    static int arr[];
    static int currentSize;

    public ArrayCrud(int n) { // constructor
        this.arr = new int[n];
        this.currentSize = 0;
    }

    int index;
    static int userChoice = 0;

    public void insert(int item) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element");
            Scanner user = new Scanner(System.in);
            arr[i] = user.nextInt();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayCrud operation = new ArrayCrud(5);
        do {

            System.out.println("Press 1 for insertion");
            System.out.println("Press 2 for updation");
            System.out.println("Press 3 for deletion");
            System.out.println("Press 4 for searching");
            System.out.println("Press 5 for Print");
            Scanner user = new Scanner(System.in);
            userChoice = user.nextInt();
            int item;
            switch (userChoice) {
                case 1:

                    System.out.println("Enter item");
                    // int item=user.nextInt();
                    int index;
                    for (int i = 0; i < arr.length; i++) {
                        System.out.println("Enter element" + ",");
                        Scanner in = new Scanner(System.in);
                        arr[i] = in.nextInt();
                        currentSize++;

                    }
                    operation.print();

                    break;
                case 2:

                    if (currentSize == 0) {
                        System.out.println("First Insert Item in Array");
                        break;
                    } else {
                        System.out.println("Enter new item ");
                        Scanner in = new Scanner(System.in);
                        int item1 = in.nextInt();
                        System.out.println("Enter index to update");
                        index = in.nextInt();
                        arr[index] = item1;
                        operation.print();
                        break;
                    }

                case 3:

                    if (currentSize == 0) {
                        System.out.println("First Insert Item in Array");
                        break;
                    }

                    else {
                        System.out.println("Enter index to delete");
                        Scanner input = new Scanner(System.in);
                        index = input.nextInt();
                        for (int i = index; i < arr.length; i++) {
                            // arr[i] = i + 1;
                            currentSize--;
                        }
                        operation.print();
                        break;
                    }
                case 4:

                    if (currentSize == 0) {
                        System.out.println("First Insert Item in Array");
                        break;
                    }

                    else {

                        System.out.println("Enter item to be Search");
                        Scanner item1 = new Scanner(System.in);
                        item = item1.nextInt();
                        boolean flag = false;

                        for (int i = 0; i < arr.length; i++) {

                            if (item == arr[i]) {
                                flag = true;

                                System.out.println("Item is at position" + arr[i]);
                                break;
                            }
                        }

                        if (flag == false)
                            System.out.println("item not found");

                        break;
                    }

                case 5:

                    if (currentSize == 0) {
                        System.out.println("First Insert Item in Array");
                        break;
                    }

                    else {
                        System.out.println("Array is=");
                        operation.print();
                    }

                default:
                    System.out.println("Press beteen 1 to 5");
                    break;

            }

        } while (userChoice != 6);

    }

}
