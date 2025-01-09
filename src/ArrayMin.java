public class ArrayMin {
    public static void main(String[] args) {
        int[] number2={11,6,2,3,7,20};
        int min=number2[0];
        for(int j=1;j< number2.length;j++){
            if(number2[j]<min){
                min=number2[j];
            }
        }
        System.out.println("MinValue:" +min);
    }
}
