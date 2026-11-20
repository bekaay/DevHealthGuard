import java.util.List;

public class Modifications {
    private List<Exercise> reminders;

    public Modifications(List<Exercise> reminders) {
        this.reminders = reminders;
    }

    public void changeTime(int index, int time) {
        if (index >= 0 && index < reminders.size()) {
            reminders.get(index).setTime(time);
        }
    }

    public void addExercise(Exercise exercise) {
        reminders.add(exercise);
    }

    public void removeExercise(int index) {
        if (index >= 0 && index < reminders.size()) {
            reminders.remove(index);
        }
    }
}
