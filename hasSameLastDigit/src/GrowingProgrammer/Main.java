package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if(first < 10 || first > 1000 || second < 10 || second > 1000 || third < 10 || third > 1000) {
            return false;
        }
        return (first % 10) == (second % 10) || (first % 10) == (third % 10) || (second % 10) == (third % 10);
    }
    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
//上面的return的写法就娴熟了很多，就是之前看别人代码学的
