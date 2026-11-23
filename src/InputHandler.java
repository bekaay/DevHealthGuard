import java.util.Scanner;
import java.util.InputMismatchException;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.\nPlease enter a number");
                scanner.nextLine();
            }
        }
    }

    public String getString(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
