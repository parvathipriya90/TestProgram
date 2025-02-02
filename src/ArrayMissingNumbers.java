import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayMissingNumbers {
    public static List<Integer> findMissingNumbers(int[] numArray) {
        if (numArray == null || numArray.length < 2) {
            return Collections.emptyList();
        }
        int previous;
        int current;
        List<Integer> missingList = new ArrayList<>();
        for (int i = 1; i < numArray.length; i++) {
            previous = numArray[i - 1];
            current = numArray[i];
            int delta = current - previous;
            if (delta > 1) {
                for (int j = previous + 1; j < current; j++) {
                    missingList.add(j);
                }
            }
        }

        return missingList;
    }

    public static void main(String[] args) {
ArrayMissingNumbers arrayMissingNumbers = new ArrayMissingNumbers();
        System.out.println(arrayMissingNumbers.findMissingNumbers(new int[]{1, 2, 5,3, 15, 10}));
    }
}