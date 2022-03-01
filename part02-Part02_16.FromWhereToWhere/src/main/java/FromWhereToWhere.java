
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?");
        int input1 = Integer.valueOf(scanner.nextLine());

        //for (int i = 1; i < input1; i++) {
        //    System.out.println(i);
        //}

        System.out.println("Where from?");
        int num2 = Integer.valueOf(scanner.nextLine());

        if (num2 <= input1) {
            for (int i = num2; i <= input1; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("");
        }
    }
}
