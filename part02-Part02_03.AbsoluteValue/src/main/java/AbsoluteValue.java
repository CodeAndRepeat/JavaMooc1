
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueOne = Integer.valueOf(scanner.nextLine()); 
        
        if(valueOne < 0){
            System.out.println(valueOne * (-1));
        } else {
            System.out.println(valueOne);
        }    
    }
}
