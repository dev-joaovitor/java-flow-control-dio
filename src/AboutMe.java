import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("enter your name");
            String name = scanner.next();

            System.out.println("enter your last name");
            String lastName = scanner.next();

            System.out.println("enter your age");
            int age = scanner.nextInt();

            System.out.println("enter your height");
            double height = scanner.nextDouble();
        }
        catch (InputMismatchException e) {
            System.err.println("age and height must be numbers");
        }
    }
}
