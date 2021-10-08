package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        //输入inches，输出多少英尺余多少英寸，然后计算这些是多少厘米
        if (inches < 0) {
            System.out.println("Invalid inches value.");
            return -1;
        }
        //这个地方的条件筛选是非常有意思的，如果是不符合条件的，直接输出条件不符合，然后返回-1即可，程序运行到这里就停止了
        //如果是按照我之前的写法需要先定义变量，满足某种条件进行运算，不满足返回-1，虽然也能运行，但是不简洁，可读性差
        //这里利用了return可以直接返回-1，这样一种做法，就能够直接进行筛选
        //在返回之前，注意是在返回之前，还可以打印无效输入值，来让整个过程更加清晰
        double feetValue = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);
        //昨天试过了，如果不加那个casting int的话，前面的变量值定义的是double，就会成为小数运算，后面的英尺英寸值就很有可能是小数，如果不能整除的话
        //我们的目的是要整数样子的小数，为什么是整数样子呢？这样看起来简便，为什么是要小数呢？因为另一个method要求的是小数
        //这种单位换算，小数也是更正常的
        //前面说明的是为什么要加int，这里还有一个问题就是int后面的额括号是要加的么？昨天已经试验过了，int后面的公式加不加括号都没事
        //这里涉及到我的一个盲区，就是除法的问题，这个单开一个project来进行学习--见Division那个项目

        //这里我最终的时候还是选择先运算，再casting，我觉得这样的顺序更符合题目

        System.out.println(inches + " inches is equal to " + feetValue + " feet and " + remainingInches + " inches.");
        return calcFeetAndInchesToCentimeters(feetValue, remainingInches);
        //这里返回的是一个函数调用，运算的结果是转换结果的值和结果的打印
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //输入英尺和剩余英寸，计算厘米数
        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid feet or inches value.");
            return -1;
        }
        double centimeters = feet * 12 * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches is equal to " + centimeters + "cm.");
        return centimeters;
    }
}
//需求：输入英尺，换算成多少英尺英寸；输入英尺英寸，然后再换算成厘米
//设计：
    // main就就不用说了，还需要一个method是把英尺转换成多少英寸的，main把英尺传递给这个method，这个method推算出英尺和英寸
    // 第二个method制作出了英尺英寸，就可以传递给第二个method，转换成厘米（虽然这个地方，直接用inches转换厘米似乎是更简单的，但这个地方应该是为了训练用）
    //于是就有了第三个method，第二个method推算出来的feet和inches都可以成为输入，转换成厘米
    //在第二个method里面调用第三个method，这样的话，直接调用第二个，就能够返回所有目标输出了；第二个里面才有英尺和英寸两个程序
    //这个地方是用的overloading，因为都是完成相似甚至是相互关联的任务，同时我也不用记这么多名字，所以才用method重载