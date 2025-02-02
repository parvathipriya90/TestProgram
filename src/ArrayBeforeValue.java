import java.util.ArrayList;
import java.util.List;

public class ArrayBeforeValue {
    public  static void main(String[] args) {
        int[] numbers={2,6,11,20,3,7,18};
        List list=new ArrayList();
        int number=8;
        for(int firstIndex=0;firstIndex<numbers.length;firstIndex++) {
            if (numbers[firstIndex] < number) {
                list.add(numbers[firstIndex]);
            }
        }
                System.out.println(list);
            }
        }
