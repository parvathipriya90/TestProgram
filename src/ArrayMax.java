public class ArrayMax {
        public static void main(String[] args) {
            int[] number1={2,6,11,20,3,7,18};
            int max = number1[0];
            for(int i=1;i<number1.length;i++) {
                if (number1[i] > max) {
                    max=number1[i];
                }
            }
            System.out.println("Maxvalue:" + max);

        }
    }