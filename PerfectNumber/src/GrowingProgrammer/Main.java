package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
}
//上面的算法很简单就是累加除了自身之外的除数，再比较除数和和自身的大小
//用while也可以写，就是for loop会更轻便，因为次数比较确定，就是number - 1
