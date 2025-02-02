

import java.util.ArrayList;
import java.util.List;

public class ArrayAfterValue {
    public static void main(String[] args){
        int[] numbers={2,6,11,20,3,7,18};
        int number=8;
        List list1=new ArrayList();
        for(int index=0;index<numbers.length;index++){
            if(numbers[index]>number){
                list1.add(numbers[index]);
            }
        }
        System.out.println(list1);

    }
}
