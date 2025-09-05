

import workflow.activity.Activity;

public class WorkflowMachine {
    public void execute(Workflow workflow){
        for(Activity activity : workflow.getActivities()){
            activity.execute();
        }

    }
}
