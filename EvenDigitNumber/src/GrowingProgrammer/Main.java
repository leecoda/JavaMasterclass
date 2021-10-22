package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    // 对于这个程序来说，输入数字，提取每个数字，判断数字是不是偶数，如果是偶数的话就相加
        //提取数字，偶数相加，两个需求
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }
        int digit = 0;
        int evenDigitSum = 0;
        while (number > 0) {
            digit = number % 10;
            if(digit % 2 == 0) {
                evenDigitSum += digit;
            }
            number /= 10;
        }
        return evenDigitSum;
    }
}
