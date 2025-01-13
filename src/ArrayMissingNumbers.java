import java.util.ArrayList;
import java.util.List;

public class ArrayMissingNumbers {
    public static void main(String[] args) {
        // Given array
        int[] array = {1, 3, 6};
        List<Integer> missingNumbers = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            boolean found = false;
            for (int number=0;number< array.length;number++) {
                System.out.println("number: " + number);
                if (i == array[number]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                missingNumbers.add(i);
            }
        }
        System.out.println("Missing numbers: " + missingNumbers);
    }
}
