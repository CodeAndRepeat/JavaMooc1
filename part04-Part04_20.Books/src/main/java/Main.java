
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

public class Main {
    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());

            System.out.println("Pages: ");
            int year = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, page, year));
        }

        System.out.println("What information will be printed? ");
        String information = scanner.nextLine();

        for (Book book : books) {
            if (information.equals("everything")) {
                System.out.println(book);
            } else if (information.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
