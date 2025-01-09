public class ArrayPivotal {
    public static void main(String[] args) {
        int[] array = {2, 6, 7, 11, 3, 18, 20};
        int pivotalValue = 10;

        int[] minArray = new int[array.length];
        int[] maxArray = new int[array.length];
        int minCount = 0, maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= pivotalValue) {
                minArray[minCount++] = array[i];
            } else {
                maxArray[maxCount++] = array[i];
            }
        }
        System.out.println("Min array: ");
        for (int i = 0; i < minCount; i++) {
            System.out.print(minArray[i] + " "); // Print elements of Min array
        }

        System.out.println("Max array: ");
        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxArray[i] + " "); // Print elements of Max array
        }
    }
}

