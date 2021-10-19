package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }
    public static boolean isPalindrome(int number) {
        int temNumber = number;
        int digit = 0;
        int reverse = 0;
        while (Math.abs(temNumber) > 0) {
            digit = temNumber % 10;
            reverse = reverse * 10 + digit;
            //上面这个步骤是非常重要的，整个的算法都是建立在之前的那个练习的基础之上的
            temNumber = temNumber / 10;
        }
        return reverse == number;
    }
//这个题目有几个地方是可以说道说道的
// 一个是因为number还需要最后比较一下看看和之前的数字是不是一样的，所以需要先放到另一个变量里面进行存储
    //还有一个点非常重要是最后的return和if else代码的结合，直接return加判定条件就可以了
    //还有一个点是绝对值，因为负数也要进行
}
