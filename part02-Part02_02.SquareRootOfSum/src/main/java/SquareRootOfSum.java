
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueOne = Integer.valueOf(scanner.nextLine());
        int valueTwo = Integer.valueOf(scanner.nextLine());
        
        double square = Math.sqrt((valueOne + valueTwo));
        System.out.println(square);
    }
}
