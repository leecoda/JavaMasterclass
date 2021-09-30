package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    int int2 = 2;
        double kilometers = 100 * 1.609344;
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }
        //上面int后面的2去掉的话就会报错，是因为int是keywords，是java的保留词汇
        //接着就是expressions，kilometers = 100 * 1.609344，这个是；highScore = 50，这个是；highScore = 50，这个是；
        //特别注意的是双引号里面的内容This is an expression，这个也是


        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }
        //上面有4个expressions，可以指出来
    }
}
