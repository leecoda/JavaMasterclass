package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    boolean leapYear = isLeapYear(-1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(1600);
        System.out.println(leapYear);
        leapYear = isLeapYear(2017);
        System.out.println(leapYear);
        leapYear = isLeapYear(2000);
        System.out.println(leapYear);
        //这次处理定义变量、调用、打印这样的任务就得心应手多了
    }

    public static boolean isLeapYear(int year) {
        boolean leapYearOrNot = false;
        if (year < 1 || year > 9999) {
            //leapYearOrNot = false;
            //上面这个代码如果不comment out的话是亮的是因为有冗余，自己之前已经定义这个boolean值是false了，所以这个地方即使是不重新赋值，都是false
            //如果这个时候删除这个语句，依然是可以运行的，结果是一样的，就是if会高亮，提醒这个if后面没有body
        } else if (year % 400 == 0) {
            leapYearOrNot = true;
        } else if ((year % 4 == 0) && (year % 100 != 0)) {
            leapYearOrNot = true;
        }
        return leapYearOrNot;
    }
    //需求:输入年份，进行判断，输出是不是闰年的boolean值
    //设计：两个method来解决，main主要是输入输出调用方法，判断程序来进行判断
    //用纸笔画一下图，看看条件都有哪些

    //对于这个练习题来说，还是筛选条件这件事情，我有什么感悟
    //分析筛选条件，合并同类条件，这个是上次学到的
    //这次学到的是从the most demanding的条件开始写起
    //我整个判断语句的写作和作业的顺序逻辑是不一致的，但是我就是整理出了这样一个逻辑，就是逻辑重构，这个逻辑重构，我还要再仔细探究一下
}
