public class FindStarPattern
    {
        public static void starPattern(int number) {
            for(int row=1;row<=number;row++) {
                for(int col=1;col<=number-row;col++) {
                    System.out.print(" ");
                }
                for(int col=1;col<=row;col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }}

