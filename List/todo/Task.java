

public class Task {
    private String description;
    private boolean isDone;
    private int identifier;

    public Task(String description, int identifier) {
        modifyDescription(description);
        this.identifier = identifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void modifyDescription(String description)throws IllegalArgumentException{
        if(description == null || description.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid task description");
        }
        setDescription(description);
    }
}
