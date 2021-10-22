package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int x, int y) {
        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        } else {
            return (x / 10) == (y / 10) || (x / 10) == (y % 10) || (x % 10) == (y % 10) || (x % 10) == (y / 10);
        }
    }
}
//这是跟一个网友学的简便的写法