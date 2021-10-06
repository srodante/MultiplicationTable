import java.util.Scanner;

public class MultiplicationTable {
       static void multipleTable(int i) {
           for (int i2 = 1; i2 < 10; i2++){
               System.out.printf("%d x %d = %d\n", i, i2, i * i2);
           }
       /*    System.out.printf("%d x 1 = %d\n", i, i * 1);
           System.out.printf("%d x 2 = %d\n", i, i * 2);
           System.out.printf("%d x 3 = %d\n", i, i * 3);
           System.out.printf("%d x 4 = %d\n", i, i * 4);
           System.out.printf("%d x 5 = %d\n", i, i * 5);
           System.out.printf("%d x 6 = %d\n", i, i * 6);
           System.out.printf("%d x 7 = %d\n", i, i * 7);
           System.out.printf("%d x 8 = %d\n", i, i * 8);
           System.out.printf("%d x 9 = %d\n", i, i * 9);
        */
       }
    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);
        int value;
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter a number: ");
            value = keybd.nextInt();

            multipleTable(value);

            keybd.nextLine(); // flush the buffer
            System.out.println("Do you want to continue (y/n):");
            answer = keybd.nextLine();
        }
        System.out.println("Bye!");
    }
}
