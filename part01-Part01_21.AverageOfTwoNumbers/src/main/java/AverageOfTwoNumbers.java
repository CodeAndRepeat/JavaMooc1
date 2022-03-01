
import java.util.Scanner;

public class AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first_number = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:"); 
        int second_number = Integer.valueOf(scanner.nextLine());
        
        double result = (first_number + second_number)/2.0;
        
        System.out.println("The average is " + result);     
    }
}
