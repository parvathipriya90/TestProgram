public class ArrayPivotalValue {
    public static void main(String[] args) {
        int[] numbers={2,6,11,20,3,7,18};
        int pivotalValue=10;
        System.out.println("Before Pivotal value" );
        for(int firstIndex=0;firstIndex<numbers.length;firstIndex++) {
            if (numbers[firstIndex] < pivotalValue) {
                System.out.println(numbers[firstIndex]);
            }

        }
        System.out.println("After Pivotal value" );
            for (int secondIndex=0;secondIndex<numbers.length;secondIndex++){
                if (numbers[secondIndex]>pivotalValue) {
                    System.out.println(numbers[secondIndex]);
                }
        }
        }
    }

