package GrowingProgrammer;

import org.openjsse.util.RSAKeyUtil;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was 5000.");
            System.out.println("This was executed.");
        }
        //code block可以没有，但是只能执行if下面一行，多行语句必须要加上code block;写代码的过程中，不管几行，写上codeblocks是一种好习惯
        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000.");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Got here");
        }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//        finalScore = 0；
        //有一个规则很重要，就是if代码框里面所设定的变量在if代码框外面是没有办法调用的，上面如何不用comment line的话就会变成红色了，就是因为这个变量是不能调用的

        //challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        //这里面有一个很好玩的点就在于，一般来说finalScore已经被规定属性了，只能重新赋值，但是并不能够再次定义属性
        //但是在之前的if框里面定义的变量，是可以重新被定义的
        //上面的练习中，我重新赋值了变量，这样做的好处就是写代码的时候非常简单，复制黏贴就好了
        //但这个里面也有问题，就是我不能保留原来的变量值了，变量值总是在变动中
        //还有一个问题就是我一旦对公式进行更改，很多其他的地方就得改，单独设置method会更加好



    }
}
