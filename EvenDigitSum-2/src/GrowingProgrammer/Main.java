package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
//        int digit = 0;
        int evenDigitSum = 0;
//        while(number > 0) {
//            digit = number % 10;
//            if(digit % 2 == 0) {
//                evenDigitSum += digit;
//            }
//            number /= 10;
//        }
        for(int digit = 0; number > 0; number /= 10) {
            digit = number % 10;
            if(digit % 2 == 0) {
                evenDigitSum += digit;
            }
        }
        return evenDigitSum;
    }
}
