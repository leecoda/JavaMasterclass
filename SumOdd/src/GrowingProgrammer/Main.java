package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(1, 100));
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(-1, 100));
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(100, 100));
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(13, 13));
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(100, -100));
        System.out.println("The sum of all the odd numbers between 1 and 100 is " + sumOdd(100, 1000));

    }
    public static boolean isOdd(int number) {
        if(number <= 0) {
            return false;
        }
        if(number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if((end < start) || (start <= 0)) {
            return -1;
        }
        //这个地方我之前写的筛选条件时(end < start) || (start <= 0) || (end <= 0)
        //但后面第三个是不必要的
        //前两个为假，那么end > = start && start > 0 就是真的，已经不需要第三个条件了
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
