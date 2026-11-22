

public class UserAction {
    private final Modifications reminder = new Modifications();

    public String addRecommendedReminder(RecommendedOption choice) {
        if (choice == null) {
            return "Invalid option";
        }

        return switch (choice) {
            case EYE_HEALTH -> {
                Exercise exercise = new Exercise("Eye Health", "Look at something far away for 20 seconds.", 20);
                reminder.addExercise(exercise);
                yield "Added Eye health reminder";}
            case POSTURE_CHECK -> {
                Exercise exercise = new Exercise("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45);
                reminder.addExercise(exercise);
                yield "Added Posture check reminder";}
            case BACK_STRETCH -> {
                Exercise exercise = new Exercise("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60);
                reminder.addExercise(exercise);
                yield "Added Back stretch reminder";}
            case ALL -> {
                Exercise exercise = new Exercise("Eye Health", "Look at something far away for 20 seconds.", 20);
                reminder.addExercise(exercise);
                Exercise exercise1 = new Exercise("Posture check", "Fix your posture, roll your shoulders back, un-cross your legs", 45);
                reminder.addExercise(exercise1);
                Exercise exercise2 = new Exercise("Back Stretch", "Stand up and do some back extensions, do 5 steps forward and backwards", 60);
                reminder.addExercise(exercise2);
                yield "Added all recommended reminders";}
        };
    }
}
