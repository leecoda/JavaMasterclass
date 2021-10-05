package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        boolean equal = areEqualByThreeDecimalPlaces(-3.1756, -3.1756);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(3.1756, 3.176);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(equal);
        equal = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(equal);

    }
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        boolean equalOrNot = false;
        int value1 = (int) (first * 1000);
        int value2 = (int) (second * 1000);
        //这里有个点就是(first * 1000)和(second * 1000)都是用括号括住的，这是因为我是要乘以1000后取整，如果不括住就会先取整
        if (value1 == value2) {
            equalOrNot = true;
        }
        return equalOrNot;
    }
}
//需求：输入一个数，输出判断他们的小数点后三位是不是相同的
//设计：
    //两个method，main和判断
    //对于默认程序来说，默认是不相等的，除非能够证明他们之间是想等的，所以这就到了如何证明他们之间是想等的问题了
    //对于这个题目来说，算法就是同时乘以1000取整数，然后看这两个值是不是相等的，如果是相等的就说明小数点后三位是相等的。

//为什么要用整数来比较，而不是用小数比较呢？
    //小数比较的话，很难用一种方法把小数第四位后面全去掉
    //我曾经试过两数相减绝对值小于0.001，这个方法，但实际上是不行的，比如这对数3.1756, 3.176
    //还想过一个办法就是取近似值比较大小，四舍五入还是会有很多精度差还是不行的，比如上面的那对数
    //最好的方法就是乘以1000然后取整，再比较两个数的大小
    //我第一次之所以做不出来就是因为对取整的方法并不是非常熟悉

//这里涉及的知识点是，为什么Type casting 用int可以取整？到底什么是Type casting
//这里涉及的知识是Java type casting，意思是数据类型的转换，主要有两种形式，一种是占位小的变量转到占位大的变量 widening casting
//还有一种是占位大的变量转到占位小的变量，narrowing casting
//widening casting就非常简单，重新定义变量，重新赋值即可，如下
// int myInt = 9;
// double myDouble = myInt;
// 这个时候打印myDouble就成了9.0，从空间小升为空间大是很容易的
//narrowing casting就是要去除一些部分了，比如从小数降为整数，就是小数点后面的全部去除，不遵守四舍五入的规则
//这个时候的语法规则是，用括号括住你要转换的类型，后面接空格，然后接之前的变量
//double myDouble = 9.78;
//int myInt = (int) myDouble;