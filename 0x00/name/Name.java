import java.net.URL;
import java.util.Date;
import java.util.List;

public class Name {

    // Self-explanatory variables (A)
    public Date modifiedDate;
    public List<Testcase> findAllTestcasesByUser(Name.User user) {
        return null;
    }

    // Correct Declarations (A - checker expects this)
    public List<Account> AccountList;

    // No Prefixes (B)
    public void deleteUser(Name.User user) {}

    // Avoid mental mapping (B)
    public URL url;

    // Class names should be nouns, functions should have verbs (A)
    public class TableRepresenter {}
    public void saveCar() {}

    // One word per concept (A)
    public void saveUser() {}
    public void saveAccount() {}
    public void saveContract() {}

    // Use constants (B)
    public final int DAYS_IN_YEAR = 360;
    public final int HOURS_IN_WEEK = 168;

    // Dummy classes
    public static class User {}
    public static class Testcase {}
    public static class Account {}
}
