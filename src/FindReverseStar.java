public class FindReverseStar {
        public static void reverseStarPattern(int number) {
            for(int row=1;row<=number;row++){
                for(int col=1;col<=row;col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

}
