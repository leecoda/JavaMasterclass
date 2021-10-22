package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }

        int digit1 = first % 10;
        int digit2 = second % 10;
        int digit3 = digit1;
        int digit4 = digit2;
        if(digit1 == digit2) {
            return true;
        }
        //上面改成 return digit1 == digit2 会报错，下面的很多变量会变成红的
        first /= 10;
        second /= 10;
        digit1 = first % 10;
        digit2 = second % 10;
        return digit1 == digit2 || digit3 == digit2 || digit1 == digit4;
    }
}
//需求很简单，提取数字进行比较，每一位上的数字都可以相互进行比较，如果有相同的就会返回true，如果没有就返回false
//两个都是两位数，只要提取两次就可以了，不用循环语句，如果是不相等的位数呢？如果有很多位呢？
//如果我要用循环语句呢？
