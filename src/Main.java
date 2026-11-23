import java.util.*;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        UI ui = new UI();
        ui.welcome();

        List<Exercise> reminders = new ArrayList<>();

        reminders.add(new Exercise("Eye health", "Look at something far away for 20 seconds.", 20));
        reminders.add(new Exercise("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45));
        reminders.add(new Exercise("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60));

        /*System.out.println("Your current reminders: ");

        for (Exercise r: reminders) {
            System.out.println("- " + r);
        }*/

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);

        scheduler.scheduleAtFixedRate(() -> System.out.println(reminders.getFirst()), 20, 20, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(() -> System.out.println(reminders.get(1)), 45, 45, TimeUnit.MINUTES);
        scheduler.scheduleAtFixedRate(() -> System.out.println(reminders.get(2)), 60, 60, TimeUnit.MINUTES);
    }
}
