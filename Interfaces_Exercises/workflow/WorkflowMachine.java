import activity.*;
import java.util.ArrayList;

public class WorkflowMachine {
    public void execute(Workflow workflow){
        for(Activity activity : workflow.getActivities()){
            activity.execute();
        }

    }
}
