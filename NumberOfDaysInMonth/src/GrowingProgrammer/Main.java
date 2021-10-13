package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(" ");

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }
    public static boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
        } else if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else if (year % 400 == 0) {
            leapYear = true;
        }
        return leapYear;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        //上面的两块代码其实是可以合并的
        boolean leapOrNot = isLeapYear(year);
        int days = 0;
        //这是一个要返回int的method，如果下面switch中直接返回天数，就会有两个问题
        //一个问题是多个返回让代码可读性没有那么强
        //另一个问题是，如果在case下面用了return，那么break就可能会出现不能到达的错误，只能删除break
        //所以这个地方设置一个天数变量，不断给这个变量赋值就可以了，并不需要重复返回
        if (!leapOrNot) {
            switch (month) {
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = 28;
                    break;
                default:
                    days = 31;
                    break;
            }
        } else {
            switch (month) {
                case 4: case 6: case 9: case 11:
                    days = 30;
                    break;
                case 2:
                    days = 29;
                    break;
                default:
                    days = 31;
                    break;
            }
        }
        //这里还有一个问题就是if嵌套switch的格式是不是太麻烦了，能不能在switch case 2下面做一个筛选
        return days;
    }
}
//需求：输入月份输出天数，这里有个隐含的需求就是要推算是不是闰年，闰年或者是非闰年2月份的天数是不一样的
//设计：
    //加上main一共有三个method
    //从小的method开始写起，计算是不是闰年
    //另一个method，如果是闰年的话，月份日期是这样的，如果不是闰年的话，月份日期是那样的
//上面就是我的设计思路