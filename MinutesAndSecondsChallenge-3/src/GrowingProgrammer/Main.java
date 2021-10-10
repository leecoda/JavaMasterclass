package GrowingProgrammer;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    //上面是常数的设置方法，常数是不可变更的数，一个变量是一个常数，那么这个变量就不能再被重新赋值
    //之前提到常数就觉得常数是一个数字，但常数也可以是不可变更的字符串
    //public static是说这个常数所涉及的method，final是说这个值不可变更，String是这个值的类型，名称全大写是因为常数名称就是要全大写
    //为什么要在method外面设置这样一个常数呢？就是为了后期不需要一遍一遍地输入同样的string，可以避免犯错，如果常数设置出了问题，也比较容易改
    public static void main(String[] args) {
        System.out.println(getDurationString(3954));
        System.out.println(getDurationString(-40));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes = minutes % 60;
        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }
    //上面加了一系列if代码操作就是为了能够出现01这样的时间表示方法
    //这个练习的代码可能不是最优解，但是我学到现在为止最好的解决办法
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
