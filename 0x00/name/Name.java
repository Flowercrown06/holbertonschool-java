import java.net.URL;
import java.util.Date;
import java.util.List;

public class Name {

    // Self-explanatory variables (choose A)
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        return null;
    }

    // Correct Declarations (choose B)
    public Account[] accountList;

    // No Prefixes (choose B)
    public void deleteUser(Name.User user) {}

    // Avoid mental mapping (choose B)
    public URL url;

    // Class names should be nouns, functions should have verbs (choose A)
    public class TableRepresenter {}
    public void saveCar() {}

    // One word per concept (choose A)
    public void saveUser() {}
    public void saveAccount() {}
    public void saveContract() {}

    // Use constants instead of magic numbers (choose B)
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;

    // Dummy inner classes to avoid compilation errors
    public static class User {}
    public static class Testcase {}
    public static class Account {}
}
