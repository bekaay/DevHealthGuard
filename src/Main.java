import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to DevHealthGuard!");

        List<Exercise> reminders = new ArrayList<>();

        reminders.add(new Exercise("Eye health", "Look at something far away for 20 seconds.", 20));
        reminders.add(new Exercise("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45));
        reminders.add(new Exercise("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60));

        System.out.println("Your current remiders: ");

        for (Exercise r: reminders) {
            System.out.println("- " + r);
        }
    }

}
