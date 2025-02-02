import java.util.HashMap;
import java.util.Map;

public class TwoSumValue {
        public static void main(String args[]) {
            int[] arr={10,11,21,7,16};
            int target=21;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                map.put(arr[i], i);
            }
            for (int i = 0; i < arr.length; i++) {
                int complement = target - arr[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    System.out.println(arr[i] + " " + complement);
                }
            }
        }
    }

