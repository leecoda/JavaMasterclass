public class speedConverter {
    //我的class的取名和他们的都不是很一致，他们总是会首字母大写，而我的取名还是按照之前的惯例，第一个字母会小写
    //我观察了一下别人的取名，也是首字母大写，我之后也要改过来
    //这次之前就先不改了，但是之后的练习中要刻意修改class和project的名称写法
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            //long milesPerHour = Math.round(kilometersPerHour / 1.609);
            //return milesPerHour;
            return Math.round(kilometersPerHour / 1.609);
        }

    }
    //在这个里面还有一个新的知识需要学习，就是如何取近似值，用的function是Math.round()
    //上面这个函数的要点是，M是大写的，round是小写的，括号里面的内容是可以选择格式的，编译器会提示你是要取什么值的近似值

    //这个编译器一个很好的点在于准确地给我指出了我代码冗余的地方，这个地方long milesPerHour这个变量的命名就是冗余的
    //之所以会这样是因为我们返回值那个地方已经规定了返回的值是一个long，所以不需要再重新定义变量以及变量属性
    //如何进行更改呢？更改的话就是直接返回round结果

    //这里还有一个知识点需要搞清楚，就是long和int之间的区别，float和double之间的区别
    //long和int都是整数，但他们所占位数是不同的，int是4个byte，32个bits；而long是8个字节，64个bits；位数越大，占内存空间越大
    //一般来说int就已经够日常使用了
    //double和float也是一样的，都是浮点数，但是double是8个字节，而float只有4个字节，double有16位有效数字，float有7个有效数字，double的精度更高
    //在日常使用中常用的是int和double



    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    //现在来说说整个任务的开发流程
    // 需求：
        // 输入：在main里面输入一个每小时kilometers的速度值（浮点数）输出：转化成一个每小时miles的速度值，并取整数近似，最后打印输出；输入负数的时候，输出数据无效
        //算法需求1：有一个方法是专门进行单位换算的，小数kilo输入，转换成miles，并取近似值，输入负数，输出-1，代表无效
        //算法需求2：还有一个method是专门用来打印的，调用方法1，得到一个数，如果是-1，就输出无效，如果是其他的，按照规定输出转换值
    //设计：
        // 从上面的需求分析可以看出是有三个方法的，main，换算，打印，三个方法；
        // main调用打印，打印调用换算；打印是一个直接输出的方法，所以不需要返回值，直接调用即可；而换算是需要返回值给打印的，所以是有返回值的
        // main调用打印是用的浮点数kilometers，打印调用换算也是用的也是用的浮点数kilometers
        // 即输入一个公里数，你要换算成英里速度，然后打印输出
        //void main, long converter, void print就出现了
    //如果我把打印取消会怎样？我在测试n个值的时候，需要重复好多遍打印代码，非常麻烦，还是变成单独的method会比较好，有重复出现的流程，可以考虑循环结构，也可以考虑单独设立method
    //两种重复有什么不同呢？一个是重复一个功能直到某个节点，另一个是想用这个功能的时候就可以调用，还是不一样的


}
