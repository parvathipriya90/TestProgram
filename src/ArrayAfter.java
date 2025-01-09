import java.util.ArrayList;
import java.util.List;

public class ArrayAfter {
    public static void main(String[] args) {
        int[] after = {2, 6, 3, 7, 11, 18, 20};
        int value = 8;
        List array = new ArrayList();
        int i;
        for (i = 0; i < after.length; i++) {
            if (after[i] > value) {
                array.add(after[i]);
            }
        }
        System.out.println("Merge values:" + array);
    }
}
