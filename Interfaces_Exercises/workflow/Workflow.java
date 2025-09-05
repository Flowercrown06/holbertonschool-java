
import java.util.ArrayList;
import activity.*;

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
