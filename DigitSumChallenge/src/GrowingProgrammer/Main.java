package GrowingProgrammer;

public class Main {
    //最好的回答是项目4
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1));
    }
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int digitSum = 0;
        int first = 0;
        int second = 0;
        do {
            first = number / 10;
            second = number % 10;
            number = first;
            digitSum  += second;
        } while (number >= 1);
        //上面的这个条件可以是first>0, number > 0, 或者是first >=1,因为first已经赋值给了number
        return digitSum;
    }
}
//计算125三位数字相加的结果，125除以10取整得到12，125除以10取余得到5，12除以10取整得到1，12除以10取余得到2，1除以10取整得到0，1除以10取余得到
//1，三个余数相加就是三个数字相加的结果，所以要把numbers循环赋值上取整得到的结果，取余得到的结果要进行叠加就是我要的数字相加的结果
//接下来就是筛选条件，什么时候停止呢？前面的推演已经知道了，当取整结果为0的时候就停止，只要是大于0或者是大于等于1都是可以的，所以就有了上面的条件

//for循环是while循环的一种语法糖版本
//for适用于循环次数比较容易确知的情况，而while适用于循环次数没有那么容易确知的情况，循环的次数是需要循环体内其他的机制来确定
//do while适合的场景是至少执行一次的情况
//三种循环形式之间并不是绝对不相通的



//语法糖（Syntactic Sugar），也称糖衣语法，指在计算机语言中添加的某种语法，这种语法对语言本身功能来说没有什么影响，只是为了方便程序员的开发，提高开发效率。说白了，语法糖就是对现有语法的一个封装。
//出处：https://www.jianshu.com/p/9fdca49fcb23
