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
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leapYear = true;
        }
        return leapYear;
    }
    //上面这个条件合并得比较挑战逻辑，我要再理解一下或且非这些合并时候的逻辑

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }
        boolean leapOrNot = isLeapYear(year);
        int days = 0;
        switch (month) {
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                if (leapOrNot) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }
}
//上面这个逻辑比之前好的一点就是switch case下面嵌套if语句
