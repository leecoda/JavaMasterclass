package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(20.5);

    }
    //这里发现的一个点是，如果直接调用method，出现的结果就是会按照所调用method的设定进行打印，但是返回值却不会出现
    //如果要想既打印method设定的那句话，同时又把返回值打印出来，就要按照上面那样写，先设置一个变量装
    //然后，打印设定的变量，这样设定的打印语句，和返回值就都可以被打印了

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
    //method signature主要有两个部分构成，名字+参数
    //今天的重点是method overloading，简单来说，就是函数重载，用同样命名的method，但是参数必须是不同的，就叫做函数重载
    public static void calculateScore() {
        System.out.println("No player name, no player score.");
    }
    //之前的两个都是要返回int，这个要求的是不返回int，用void也是可以的
    //刚刚还学习到一个新的知识，就是编译器区分是不是同一个method，主要是看signature，而不是看返回值
    //我现在还在思考的一个问题是method overload的意义究竟是什么，我可能之后才能体会到

    public static double clacFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeter = 0;
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            centimeter = (feet * 12 * 2.54) + (inches * 2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeter + "cm");
            return centimeter;
        } else {
            System.out.println("Invalid value.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double feetValue = 0;
        double remainingInch = 0;
        if (inches >= 0) {
            feetValue = (int)(inches / 12);
            remainingInch = (int) (inches % 12);
            //这个地方我在int后面都加了括号，是因为上次做练习的时候发现如果不加括号，会直接按照顺序计算，然后输出一个错误的结果
            //但在这个练习里面后面加不加括号都是一样的
            System.out.println(inches + " inches equals to " + feetValue + " feet and " + remainingInch + " inches.");
            return clacFeetAndInchesToCentimeters(feetValue, remainingInch);
        } else {
            System.out.println("Invalid value.");
            return -1;
        }
    }
    //老师这个地方和我写得很不一样，感觉比我的要简洁很多，那种写法，明天可以重新写一下，然后比较一下
    //之后有新的challenge还是重新开一个project，这样堆在一起很不清晰
    //老师现在的这个练习指导语真的不够清晰
}
