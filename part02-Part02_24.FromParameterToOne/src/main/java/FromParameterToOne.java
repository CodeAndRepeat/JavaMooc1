
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(6);

    }

    public static void printFromNumberToOne(int number) {
        for (int counter = number; counter >= 1; counter--) {
            System.out.println(counter);
        }
    }
}
