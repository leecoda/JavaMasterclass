package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        //之后如果有无效值范围的话，在debug的时候可以试着用无效值看看代码是否正确
    }
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (60 * 24 * 365);
            long days = (minutes % (60 * 24 * 365)) / (60 * 24);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
//上面现在这个写法是正确的，但之前的时候那个版本是错误的，下面是我错误的代码
//if (minutes < 0) {
//    System.out.println("Invalid Value");
// }
// long years = minutes / (60 * 24 * 365);
// long days = (minutes % (60 * 24 * 365)) / (60 * 24);
// System.out.println(minutes + " min = " + years + " y and " + days + " d");
// }
//上面的代码错误的地方就在于还以为是有返回值，可以再if筛选中无效值可以返回后面就不用运行了，但实际情况是，这个是无返回值的
//筛选后不会中断，而是会继续往下运行，所以这个时候必须要用else结构
