

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List <Task> tasks;

    public TodoList(List<Task> tasks) {
        this.tasks = tasks;
    }
    public TodoList(){}

    public void addTask(Task task) {
        if (tasks.stream().anyMatch(t -> t.getIdentifier() == task.getIdentifier())) {
            throw new IllegalArgumentException(
                    "Task with identifier " + task.getIdentifier() + " already exists in the list."
            );
        }
        tasks.add(task);
    }

    public boolean markTaskDone(int identifier) {
        Task task = tasks.stream()
                .filter(t -> t.getIdentifier() == identifier)
                .findFirst()
                .orElse(null);

        if (task != null) {
            task.setDone(true);
            return true;
        }
        return false;
    }

    public boolean undoTask(int identifier){
        Task task = tasks.stream().filter(t->t.getIdentifier()==identifier).findFirst().orElse(null);
        if(task != null){
            task.setDone(false);
            return true;
        }
        return false;
    }

    public void undoAll(){
        tasks.forEach(t->t.setDone(false));
    }
    public void completeAll(){
        tasks.forEach(t->t.setDone(true));
    }
    public void listTasks(){
        tasks.forEach(t -> {
            String status = t.isDone() ? "[X]" : "[ ]";
            System.out.println(status + "  Id: " + t.getIdentifier() +
                    " - Description: " + t.getDescription());
        });    }


}
