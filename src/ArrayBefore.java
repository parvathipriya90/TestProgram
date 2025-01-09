import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBefore {
    public static void main(String[] args)
    {
        int[] before={2,6,3,7,11,18,20};
        List ob=new ArrayList();
        int value=8;
        for(int i=0;i< before.length;i++) {
            if (before[i] < value) {
                ob.add(before[i]);

            }
        }
        System.out.println(ob);
    }
}

