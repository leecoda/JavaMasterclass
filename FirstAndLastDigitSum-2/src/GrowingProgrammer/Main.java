package GrowingProgrammer;

public class Main {
    //A wrong method
    //下面这个写法不符合要求的一点是，只有一个数字的时候，第一个和最后一个不会重复加
    //还是把这个写出来是因为，如果要求变了，就可以这么写，还是学到了很多
    //number >= 10,这个筛选条件就能保证提取出第一个数字来，否则的话还要再设置一个变量
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
        int first = 0;
        while (number >= 10) {
            first = number / 10;
            number = first;
        }
        return last + first;
    }
}
