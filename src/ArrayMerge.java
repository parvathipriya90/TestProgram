import java.util.Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
        int a=0;
        int[] merge1={2,6,3,7};
        int[] merge2={11,18,20};
        int[] merge3=new int[merge1.length+merge2.length];
        for(int i=0;i< merge1.length;i++){
            merge3[a]=merge1[i];
            a++;
        }
        for(int i=0;i< merge2.length;i++){
            merge3[a]=merge2[i];
            a++;
        }
        System.out.println(Arrays.toString(merge3));
    }
}