
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scan.nextLine());

        if (firstValue < secondValue) {
            System.out.println("Greater number is: " + secondValue);
        } else if (firstValue == secondValue) {
            System.out.println("The number are equal!");
        } else {
            System.out.println("Greater number is: " + firstValue);
        }
    }
}
