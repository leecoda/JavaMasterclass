package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    printDayOfTheWeek(2);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(8);
        anotherMethod(2);
        anotherMethod(-1);
        anotherMethod(7);
        anotherMethod(0);
        //测试的时候注意数字的选择
    }
    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
                //最后的这个break加上去之后逻辑是完整的，但因为这已经是最后一行了，不加也是可以的
        }
    }

    public static void anotherMethod(int day) {
        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
    //上面两个method，莫名觉得switch会更加简单一点
}
