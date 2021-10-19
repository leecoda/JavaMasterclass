package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1));

    }
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int digitSum = 0;
        int first = 0;
        int second = 0;
        do {
            first = number / 10;
            second = number % 10;
            number = first;
            digitSum  += second;
        } while (first >= 1);
        return digitSum;
    }
}
