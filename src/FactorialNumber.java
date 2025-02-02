public class FactorialNumber {
        public static void main(String args[]) {
            int factorialValue=1;
            int number=5;
            for(int currentNumber=1;currentNumber<=number;currentNumber++){
                factorialValue=factorialValue*currentNumber;
                System.out.println(factorialValue);
            }
        }
    }
