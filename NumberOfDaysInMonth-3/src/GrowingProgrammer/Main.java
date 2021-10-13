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

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        }
        boolean leapOrNot = isLeapYear(year);
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (leapOrNot) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 31;
        }
    }
}
//上面用了return就不会再运行下面的代码了，就节约了break
//这是这个代码的另一种写法，也是可以成立的。
//break的功效是结束switch，所以有的时候default下面的代码不写break也是可以的
// return的功能是返回调取函数的那个method，这个函数就终止了，也就终止了switch，也起到了同样的作用
//都很简洁，但是另一个的可读性更强