package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(420));
    }
    public static int getLargestPrime(int number) {
        if(number < 2) {
            return -1;
        }
        int tempNumber = 0;
        for(int f = 2; f <= number; f++) {
            if(number % f == 0) {
                boolean prime = true;
                for(int i = 2; i <= Math.sqrt(f); i++) {
                    if(f % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime) {
                    tempNumber = f;
                }
            }
        }
        return tempNumber;
    }
}
