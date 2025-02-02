//Input array : [2, 6, 11, 20, 3, 7, 18]

//First prob: find max value
//Ans:20
public class ArrayFindMaxValue
{
    public static void main(String[] args){
        int[] numbers={2,6,11,20,3,7,18};
    int maxValue=numbers[0];
    for(int index=1;index<numbers.length;index++) {
        if (numbers[index] > maxValue) {
            maxValue = numbers[index];
        }
    }
    System.out.println(maxValue);
}
}
