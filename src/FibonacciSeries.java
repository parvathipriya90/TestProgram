public class FibonacciSeries {
        public static void main(String args[])
        {
            int numbers=10;
            int number1=0,number2=1,number3=0;
            for(int count=1;count<=numbers;count++){
                System.out.println(number1+" ");
                number3 = number1+number2;
                number1=number2;
                number2=number3;
            }
        }

}
