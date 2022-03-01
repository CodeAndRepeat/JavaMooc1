
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int values = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if(values == 0 && number <= 0){
                System.out.println("Cannot calculate the avarage");
            }
            
            if(number == 0){
                break;
            } 
            
            if(values >= 0 && number >0){
                values = values + 1; 
                sum = sum + number;
            }
        } 
        
        double avaradge = (sum * 1.0) / values;
        System.out.println("Avaradge of the numbers: " + avaradge);
    }
}
