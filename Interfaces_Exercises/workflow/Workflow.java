

import workflow.activity.Activity;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
    private List <Activity> activities = new ArrayList<>();

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public void registerActivity(Activity activity){
        activities.add(activity);

    }
}
