import java.util.HashSet;
import java.util.TreeSet;

public class DuplicatedNumbers {

    static public TreeSet<Integer> isFind(int[] integers) {
        TreeSet<Integer> duplicates = new TreeSet<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (Integer integer: integers) {
            if (!set.add(integer)) {
                duplicates.add(integer);
            }
        }

        return duplicates;
    }
}
