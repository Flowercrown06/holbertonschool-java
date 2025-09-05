import activity.*;
import java.util.ArrayList;
import java.util.List;

public class WorkflowMachine {
    public void execute(Workflow workflow){
        for(Activity activity : workflow.getActivities()){
            activity.execute();
        }

    }
}
