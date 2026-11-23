

public class UserAction {
    private final Modifications reminder = new Modifications();

    public String addRecommendedReminder(RecommendedOption choice) {
        if (choice == null) {
            return "Invalid option";
        }

        return switch (choice) {
            case EYE_HEALTH -> {
                createReminder("Eye Health", "Look at something far away for 20 seconds.", 20);
                yield "Added Eye health reminder";}
            case POSTURE_CHECK -> {
                createReminder("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45);
                yield "Added Posture check reminder";}
            case BACK_STRETCH -> {
                createReminder("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60);
                yield "Added Back stretch reminder";}
            case ALL -> {
                createReminder("Eye Health", "Look at something far away for 20 seconds.", 20);
                createReminder("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45);
                createReminder("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60);
                yield "Added all recommended reminders";}
        };
    }

    public void createReminder(String title, String description, int time) {
        Exercise exercise = new Exercise(title, description, time);
        reminder.addExercise(exercise);
    }
}
