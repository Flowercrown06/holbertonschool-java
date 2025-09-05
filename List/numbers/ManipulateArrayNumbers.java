
import List;

public class ManipulateArrayNumbers {
    public static int findNumberPosition(List<Integer> numbers, int target){
        return numbers.indexOf(target);

    }

    public static void addNumber(List<Integer> numbers, int num) throws Exception {
        if (findNumberPosition(numbers,num) != -1){
            throw new Exception("Number already in the list");
        }
        numbers.add(num);
    }

    public static void removeNumber(List<Integer> list, int number) throws Exception {
        if (findNumberPosition(list, number) == -1) {
            throw new Exception("Number not found in the list");
        }
        list.remove(list.indexOf(number));
    }

    public static void replaceNumber(List<Integer> list, int numberToReplace, int replacementNumber) {
        int pos = findNumberPosition(list, numberToReplace);
        if (pos != -1) {
            list.set(pos, replacementNumber);
        } else {
            list.add(replacementNumber);
        }
    }

}
