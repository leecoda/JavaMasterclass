package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    boolean TeenIn = hasTeen(9, 99, 19);
        System.out.println(TeenIn);
        TeenIn = hasTeen(23, 15, 42);
        System.out.println(TeenIn);
        TeenIn = hasTeen(22, 23, 34);
        System.out.println(TeenIn);

        boolean Teen = isTeen(9);
        System.out.println(Teen);
        Teen = isTeen(13);
        System.out.println(Teen);

    }
    public static boolean hasTeen(int first, int second, int third) {
        boolean hasTeenOrNot = false;
        if (first >= 13 && first <=19) {
            hasTeenOrNot = true;
        } else if (second >= 13 && second <= 19) {
            hasTeenOrNot = true;
        } else if (third >= 13 && third <= 19) {
            hasTeenOrNot = true;
        }
        return hasTeenOrNot;
    }

    public static boolean isTeen (int number) {
        return number >= 13 && number <= 19;
    }
    //上面的这个写法又让我学到了，return还有这样神秘写法
    //先写一下之前的代码
    //boolean isTeenOrNot = false;
    //if (number >= 13 && number <= 19) {
    //  isTeenOrNot = true;
    // }
    // return isTeenOrNot;
    //解构一下上面的代码，方法承接一个整数，然后return后面直接跟判断条件，如果是对的，就返回true，如果不是对的，就返回false
    //今天会让我想起Ternary变量，有时间可以练习一下是如何使用的
}
//需求：第一个method是满足需求，输入三个数，判断是不是有一个数在固定区间；第二个method的目的是，输入一个数，判断是不是在一个闭区间
//设计：基本和之前的练习是相同的


