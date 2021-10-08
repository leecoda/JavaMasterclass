package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    int a = 10;
        int b = 3;
        int c = a / b;
        System.out.println(c);
        //两个整数相除，求一个整数，就是除法取整，会计算，然后只留整数
        double d = a / b;
        System.out.println(d);
        //这个时候设置变量d，属性为double，a和b还是那两个整数，最后结果改变是属性，并不是值
        //也就是说，两个整数相除，最后得到的结果就是取整的，虽然属性可以是double
        //上面的高亮是在提醒，还是整数相除，但求的是一个double，取整之后会转换成小数形式
        double e = 10.0;
        d = e / b;
        System.out.println(d);
        double f = 3.0;
        d = a / f;
        System.out.println(d);
        d = e / f;
        System.out.println(d);
        //此时这个d的值就是真正的小数除法
        //这样我们可以得出一个结论，要想除法是真正的小数除法，需要被赋值的结果变量是double，其中至少有一个数(除数或者被除数)是double
        //最后一个输出表明，结果属性是double，除数和被除数都是小数的时候也是真正的小数除法
        System.out.println(" ~~~~");
        double g = (int) e / f;
        System.out.println(g);
        g = (int) (e / f);
        System.out.println(g);
        g = (int) e / 3;
        System.out.println(g);
        g = (int) e / 3.0;
        System.out.println(g);
        //上面开始叠加casting，然后就发现其运算顺序是这样的，如果不加括号，就是先把分子，也就是被除数取整，然后再进行运算
        //如果把后面用括号括住之后，就是先运算后面
        //运算的时候还是遵循之前的规则，如果有至少一个小数的时候就是小数运算

        //之前的那个练习里面，除数是12，所以整个的结果就取决于被除数是整数还是小数，结果属性又是double不能改变
        //如果结果要得到一个整数样的小数，就要把被除数取整，然后用除法取整，或者先把除法算出来，然后再取整，两个的结果在这种情况下差别是不大的
        //因为被除数是12
        //如果被除数是一个小数，可能就会有差别了，所以我觉得，casting后面加个括号可能会比较好

        //下面我们来看看乘法会怎么样
        System.out.println("   ~~~");
        int h = a * b;
        System.out.println(h);
        d = e * b;
        System.out.println(d);
        //前面这个时候如果写 h = e * b 就会报错，因为一个小数乘以一个整数不能是整数类型
        d = a * b;
        System.out.println(d);
        //这个时候用两个整数去相乘，结果定义为小数，结果也是一个小数
        //这个地方和除法不一样，除法那个是取整，是取整之后再转换成小数的形式

        //我之前的时候做的那个练习，验证小数点前三位是不是相同的，所以就要先把数字乘以1000，然后再取整，这个时候后面的括号就是必须的
        //如果后面的括号并不加，就会把那个小数先取整，然后再乘以1000，就不能提取小数点后前三位

        //下面再说说取余这个事情
        System.out.println("   ~~~~");
        int i = a % b;
        System.out.println(i);
        d = a % b;
        System.out.println(d);
        d = e % b;
        System.out.println(d);
        //这个地方如果用i = e % b;就会报错，因为后面得到的结果是一个小数
        d = e % f;
        System.out.println(d);
        //两个小数取余，结果还是小数

        System.out.println("   ~~~");
        d = (int) e % b;
        System.out.println(d);
        //运算顺序是int先取整后面的数，然后再取余
        d = (int) (e % f);
        System.out.println(d);
        //这个的运算顺序是先括号，再int
        d = (int) e % 0.3;
        System.out.println(d);
        //这个就体现出来是先取整，然后再取余了
        d = (int) (e % 0.3);
        System.out.println(d);
        //这个对于先括号再取整就体现得比较明显

        //除号 / 一般是取整的意思，除非除数或被除数至少有一个是小数
        //如果没有小数，但是结果变量属性是小数，就会把取整的结果后面加上一个0,给转变成小数
        //casting的运算，一般是按照顺序的，除非有括号介入
        //先取整再运算，还是先运算再取整，涉及到小数的乘法，除法，取余等运算的时候可能是不准确的，所以要想好这个地方的运算





    }
}
