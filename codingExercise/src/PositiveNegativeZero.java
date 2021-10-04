public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);

        print(5);
        print(-10);
        print(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    //需求：输入一个数字（整数），输出数字类别
    //设计：
        //  所以我需要一个main程序，需要一个对数字分类并打印的程序;main调用分类打印程序的就是那个整数
        //  如果设计的复杂点，可以是一个main，一个打印程序，一个分类返回程序，但因为是直接分类输入即可，所以两个方法就可以了
        //  分类的筛选是用的if语句，因为就是一个比较值大小分类的；其实只要是分类，一般都会用if语句

    //The program can be coded in another way
    //下面这个程序的写法是另一种解法，但是复杂了很多完全没有必要，我在写的时候还是有生涩感，有必要复盘一下是为什么
    //需求：输入一个数字，输出数字类别
    //设计：
        //我需要有三个method，一个是main，一个是打印程序，一个是判断数字类别的程序
        //对于main来说的话，最主要的是调动打印method进行打印，pass一个数字给打印,打印完成判断输出
        //对于打印method来说，承接传递过来的数字，然后传给判断程序，得到一个返回值，这个返回值帮助打印程序判断应该输出什么
        //对于打印method来说，把承接来的数字传递给判断程序，得到的返回值应该是一个indicator，不用再用之前的number来表示，虽然也可以，但是如果用一个新的值会更加清晰
        //判断程序，叫做numberType，承接从print传递过来的数字，还是main传过来的那个数字，对那个数字进行判断，然后传递一个indicator出去
    public static void print(int number) {
        int indicator = numberType(number);
        if (indicator == 0) {
            System.out.println("zero");
        } else if (indicator == 1) {
            System.out.println("positive");
        } else if (indicator == -1) {
            System.out.println("negative");
        }
    }

    public static int numberType(int number) {
        int i = 1;
        if (number == 0) {
            i = 0;
        } else if (number < 0) {
            i = -1;
        }
        return i;
    }
}




