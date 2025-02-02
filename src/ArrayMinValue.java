public class ArrayMinValue {
    public static void main(String[] args) {
        int[] numbers={2,6,11,20,3,7,18};
        int minValue=numbers[0];
        for(int index=1;index<numbers.length;index++){
            if(numbers[index]<minValue){
                minValue=numbers[index];
            }
        }
        System.out.println(minValue);
    }
}
