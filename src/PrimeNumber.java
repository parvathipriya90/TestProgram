public class PrimeNumber {
    public static void main(String args[]){
            int number=5;
            for(int num=2;num<=number;num++){
                boolean isPrime=true;
                for(int divisor=2;divisor<=num/2;divisor++){
                    if(num%divisor==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime)
                {
                    System.out.println(num + " ");
                }
            }

        }
    }

