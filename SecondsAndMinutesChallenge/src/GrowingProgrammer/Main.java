package GrowingProgrammer;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //String duration = getDurationString(3601);
        //System.out.println(duration);
        System.out.println(getDurationString(3957));
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            //System.out.println("Invalid value");
            //return -1;
            return "Invalid value";
        }
        //seconds = minutes * 60 + seconds;
        //int hours = seconds / 3600;
        //minutes = (seconds % 3600) / 60;
        //seconds = (seconds % 3600) % 60;
        //System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        //前面改成了string就可以直接返回，上面代码删除
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
        //前面的代码之所以会大面积删除是因为，自己要做的之前的设计误解了本题的含义。这个题目的意思是说
        //输入秒，计算出分钟和剩余秒，然后用另一个程序把分钟划分成时和剩余分，然后再一起输出时分秒
    }

    public static String getDurationString(int seconds) {
        //之所以在这次的变量当中选择String还是因为受到之前的练习的影响，其实我自己觉得也是要用String会更加黑
        if (seconds < 0) {
            //System.out.println("Invalid value");
            //return -1;
            return "Invalid value";
            //之前的写法其实是有点麻烦的，我之所以会选择打印信息，并且返回-1，实际上是因为返回值规定的是int，为了能够返回int
            //但如果就是要返回string，那么就可以直接返回打印值了
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        //System.out.println(seconds + " seconds" + " is equal to " + minutes + "m " + remainingSeconds +"s");
        //上面这行代码并不需要，我之所以会打印出来是因为之前练习就是打印出来的，所以我以为会需要打印出来
        return getDurationString(minutes, remainingSeconds);
    }
}
