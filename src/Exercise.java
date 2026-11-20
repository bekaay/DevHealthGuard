

public class Exercise {
    private String title;
    private String description;
    private int time;

    public Exercise(String title, String description, int time) {
        this.title = title;
        this.description = description;
        this.time = time;
    }

    public String getTitle() {
        return this.title;
    }

    public String getDescription() {
        return this.description;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "[Reminder: " + title + "] " + description + " (Every " + time + " mins)";
    }
}
