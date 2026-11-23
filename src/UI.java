import java.util.Scanner;

public class UI {
    private final Scanner scanner = new Scanner(System.in);
    private final UserAction userAction = new UserAction();
    private final InputHandler inputHandler = new InputHandler(scanner);

    public void welcome() {
        System.out.println("Welcome to DevHealthGuard!");
        System.out.println("--------------------------");
        System.out.println("Recommended reminders: ");
        System.out.print("1. Eye health\n2. Posture check\n3. Back Stretch\n");
        System.out.print("---------------------------\n");
        System.out.println("| 1 - Add reminder(s) |\n| 2 - Create your own reminder |");
        int choice = inputHandler.getInt("Choose an option: ");

        if (choice == 1) {
            System.out.println("What recommended reminder would you like to add?");
            System.out.println("| 1. Eye health | 2. Posture check | 3. Back Stretch | 4. Add all |");
            int reminderChoice = inputHandler.getInt("Choose an option:");
            RecommendedOption recommendedOption = RecommendedOption.fromChoice(reminderChoice);

            String result = userAction.addRecommendedReminder(recommendedOption);
            System.out.println(result);
        }

        else if (choice == 2) {
            System.out.println("Create a new reminder:");
            String title = inputHandler.getString("Title: ");
            String description = inputHandler.getString("Description: ");
            int time = inputHandler.getInt("Time: ");
            userAction.createReminder(title, description, time);
        }

        else {
            System.out.println("Invalid option");
        }
    }
}
