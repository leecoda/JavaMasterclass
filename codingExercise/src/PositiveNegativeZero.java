public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
//需求：输入一个数字（整数），输出数字类别
//设计：
//  所以我需要一个main程序，需要一个对数字分类并打印的程序;main调用分类打印程序的就是那个整数
//  如果设计的复杂点，可以是一个main，一个打印程序，一个分类返回程序，但因为是直接分类输入即可，所以两个方法就可以了
//  分类的筛选是用的if语句，因为就是一个比较值大小分类的；其实只要是分类，一般都会用if语句