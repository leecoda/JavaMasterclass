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
    }
    public static boolean isLeapYear(int year) {
        boolean leapYearOrNot = false;
        if (year < 1 || year > 9999) {
        } else if (year % 4 != 0) {
        } else if (year % 100 != 0) {
            leapYearOrNot = true;
        } else if (year % 400 == 0) {
            leapYearOrNot = true;
        }
        return leapYearOrNot;
    }
    //上面这个程序就和练习题目中的逻辑差不多了，先划定一个范围，然后再这个范围里最demanding的要求是能被400整除
    //或者连被4整除都不够资格
    //然后我们的逻辑就从这个地方开始写
    //还有很多其他的写法，但现在我觉得我在上一个LeapYear项目里面写的代码可读性更强

}
