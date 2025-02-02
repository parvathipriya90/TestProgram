import java.util.Arrays;

public class ArrayMergeValue {
    public static void main(String[] args) {
        int number=0;
        int[] numbers1={2,6,3,7};
        int[] numbers2={11,18,20};
        int[] merge=new int[numbers1.length+numbers2.length];
        for(int firstIndex=0;firstIndex< numbers1.length;firstIndex++){
            merge[number]=numbers1[firstIndex];
            number++;
        }
        for(int firstIndex=0;firstIndex< numbers2.length;firstIndex++){
            merge[number]=numbers2[firstIndex];
            number++;
        }
        System.out.println(Arrays.toString(merge));
    }
}

