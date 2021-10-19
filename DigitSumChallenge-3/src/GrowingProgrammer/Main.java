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
        for(digitSum = 0; number > 0; digitSum += second) {
            first = number / 10;
            second = number % 10;
            number = first;
        }

        return digitSum;
    }
    //这个程序还可以更加简便，可以见project 4

    //上面这个我还是用for loop写了出来
    //for loop的本质认识得更加清楚了，第一步的时候并不一定是定义变量，如果之前已经设定了一个变量，重新赋值也是很好的，或者重复一下原先的赋值也很好
    //第二部的时候就是一个筛选条件，不一定是某个计数装置
    //第三个就是一个叠加的机制，不一定和筛选条件有什么关系

    //总体来说，三种循环方式，有的程序是三种都能写的，有的是只有一种或者两种能写，但总有最简便的写法
    //就这个来说的话，while loop似乎是最好的， do-while也可以
}
