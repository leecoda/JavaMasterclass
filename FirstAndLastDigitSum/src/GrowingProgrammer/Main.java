package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int last = number % 10;
        int digit = 0;
        int first = 0;
        while (number > 0) {
            //这个地方的条件也是必要的，因为前面只是排除了number > 0, 没有排除number == 0的情况，而在这个循环中是要排除的
            //当number是0的时候就会跳过这个循环，最后直接0+0，返回
            digit = number / 10;
            first = number;
            number = digit;
        }
//        for(int digit = 0; number > 0; number = digit) {
//            digit = number / 10;
//            first = number;
//        }
//上面for的解决办法也是可以的
        return first + last;
    }
}

