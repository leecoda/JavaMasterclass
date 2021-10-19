package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    // for loop是你能够知道要循环多少次的时候用的，如果不知道的话，用while loop
        //对于知道计数所少次的，也是可以用while loop的
        //两者有结构的上的不同，但很多地方是一样的
        //在开始写程序之前空了一行，增加了可读性
        int count = 1;
        //如果上面的count直接设置的就是5，那么下面这个loop就会直接被跳过
        while (count != 5) {
            System.out.println("The count value is " + count);
            count++;
            //上面这个count++，如果被省略的话，就会变成一个无限loop，没有停止的时候
        }
        System.out.println(" ");
        //上面的这个程序就可以用for loop写一遍
        //上面还有一个值得说的点就是筛选条件的设置，用的是不等于，不等于就停了，和设置小于5是一个效果
        for(int i = 1; i != 5; i++) {
            System.out.println("The count value is " + i);
        }
        System.out.println(" ");
        count = 1;
        while(true) {
            if(count == 5) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        //上面是这个loop的另一种写法，具体的办法就是把条件移到了框内，while后面接true
        //这种写法可以让我对程序有更多的认知，但是并不简洁
        System.out.println(" ");
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 5);
        //do while loop也可以写上面的程序，只是把筛选条件放到后面来进行筛选即可
        //两者有什么区别呢？
            //在do-while loop里面，如果count改为了5，这个loop就会无限循环下去，因为上来加1，就成了6，就会永远满足筛选条件
            //如果筛选条件改成了count < 5就不会有这样的问题了
            //两者之间最重要的差别还是先执行命令再判断，还是先判断再执行命令，比如count = 5，把筛选条件定为count<5
            // while loop的话，就会直接跳过，但do while的话，会执行一遍，也就是输出count value was 5然后再停止，如下
        System.out.println(" ");
        count = 5;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count < 5);

        System.out.println(" ");
        count = 5;
        do {
            System.out.println("Count value was " + count);
            count++;
            if(count > 20) {
                break;
            }
        } while (count != 5);
        //上面是break在do while loop里面的一种应用

    }
}
