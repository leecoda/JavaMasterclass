package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(false, 2);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, 8);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
    //可以在打印框里面直接调用method，但问题是可读性会很差
    //所以采取的策略是先找个箱子装返回值，然后打印返回值
    //后面就不需要重新定义这个箱子，只要重新赋值即可，可以复制代码，重新填写值就好了，重新定义代码会占内存
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeOrNot = false;
        //这里的一个问题就是，我可不可以用和main里面同样的boolean变量，就是说能不能定义同样的名称
        //可以是可以，还有一个承接感，但一定要重新定义，因为两个method除了参数，定义的变量是不通用的
        //我会选择用不同的变量名称，就是想要突出他们并不是一个变量
        if (barking && hourOfDay >= 0 && hourOfDay < 8) {
            wakeOrNot = true;
        } else if (barking && hourOfDay > 22 && hourOfDay <= 23) {
            //这里高亮是因为，反正我输入的是整数，在这个区间内的整数只有23，我可以定为等于23就可以了，但是我还是用了这个区间
            //坚持用这个区间是因为，我要呈现的就是一个区间，虽然输入值只是整数
            wakeOrNot = true;
        }
        return wakeOrNot;
        //写这个程序最符合直觉的做法就是判断一个条件，然后返回一个值
        //第一个提升是把条件进行合并，这样代码更加简洁
        //第二个提升是把返回值放到一个变量里面，这样就不用多次返回了，可读性又有提高
        //第三个提升是这个结构，默认返回值是false，等到满足某种条件时才是true，不满足这个条件就会直接执行下面，返回默认值，这样的结构是很简洁的
    }
}
//程序复盘
//需求：
    //输入：狗叫与否，狗叫时间
    //一个判断要不要起床的程序
    //输出：要不要起床的程序返回一个boolean值，在主程序里打印出来
//设计：
    //有两个method，main负责调用程序，输入和打印；判断起床的method来判断要不要起床，返回一个boolean值
    //判断起床的程序承接的是两个变量，一个是狗会不会叫，一个是狗叫的时间是怎样的
    //对于这种分情况讨论的题目，还是要画图，画图之后合并相同结果的条件，不画图是不行的
    //最后发现只有两个时间段有狗叫的时候是true，需要起床，其他时间节点或者是狗不叫的时候都是false，于是就有了上面的代码

//下面是程序写之前的需求分析和程序设计，比较乱，上面是最终程序写好之后重新写的
//需求：在某个时间节点，狗叫了，（前面两个是输入）；判断要不要起床查看；输出结果
//设计：
    //有main和判断起床两个method
    //main主要是调用判断起床程序，输入值用的
    //判断起床method承接从主程序传过来的狗叫和时间节点两个值，进行分类，然后输出
    //分类主要有几种，大于等于8，小于等于22，那么就不用是false （狗叫了）
    //大于等于0，小于8或者大于22且小于等于23，结果就是true （狗叫了）
    //其他的值就是false （狗叫了）
    //狗不叫的时候要说 dog is not barking
    //所以用逻辑符号加if语句就可以了
