
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] number1={2,6,11,20,3,7,18};
        int max = number1[0];
        int min=number1[0];
        for(int i=1;i<number1.length;i++) {
            if (number1[i] > max) {
                max=number1[i];
            }
        }
        for(int j=1;j< number1.length;j++){
            if(number1[j]<min){
                min=number1[j];
            }
        }
        System.out.println("MaxValue:" +max);
        System.out.println("MinValue:" +min);
    }
}
