public class FindSumValue {
    public static void main(String args[]) {
        int[] numArray={1,2,5,8,10};
        int target=10;
        for (int firstIndex = 0; firstIndex < numArray.length; firstIndex++) {
            for(int secondIndex=firstIndex+1;secondIndex<numArray.length;secondIndex++){
                if(numArray[firstIndex]+numArray[secondIndex]==target){
                    System.out.println(numArray[firstIndex]+" "+numArray[secondIndex]);
                }
            }
        }
    }
}
