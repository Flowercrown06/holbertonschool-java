

public class Task {
    private String description;
    private boolean isDone;
    private int identifier;


    public Task(String description, int identifier) {
        modifyDescription(description); // validasiya ilə description
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        this.isDone = done;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void modifyDescription(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid task description");
        }
        this.description = description;
    }
}
