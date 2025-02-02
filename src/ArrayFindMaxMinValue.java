public class ArrayFindMaxMinValue {
    public static void main(String[] args) {
                int[] numbers = {2, 6, 11, 20, 3, 7, 18};
                int maxValue=numbers[0];
                int minValue=numbers[0];
                for(int firstIndex=1;firstIndex<numbers.length;firstIndex++) {
                    if (numbers[firstIndex] > maxValue) {
                        maxValue = numbers[firstIndex];
                    }
                }
        System.out.println(maxValue);
        for(int secondIndex=1;secondIndex<numbers.length;secondIndex++) {
                    if (numbers[secondIndex]<minValue) {
                        minValue = numbers[secondIndex];
                    }
                }
                System.out.println(minValue);
                    }
                }

