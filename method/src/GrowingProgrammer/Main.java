package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 300);
        //前面是直接写值的，可以再前面再定义一次变量，然后在括号里面写变量的名称
        System.out.println(newScore(false, 100,3, 200));
        System.out.println(newScore(true, 800, 5, 100));
        //newScore里面是只有值返回的，所以如果要能够在调用的时候看到值，就要在主程序里有打印语句
        //上面的没有返回值的方法调用里面是直接调用，没有用打印，因为程序里面是直接有打印的，直接调用就可以了

        star(5);
        System.out.println(" ");
        System.out.println(starLine(5));
    }
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int newScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        } else  {
            return -1;
        }
//如果不用这个else以及return的话，会报错，因为gameOver是false的时候没有返回值
    }
    public static int daScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
        //上面这种情况，不是用else语句，而是在外面再加一个return，就可以了

    }
    public static void star(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("**");
        }

    }
    //从上面这个例子就可以看出，method名称后面括号里的参数，指的是要传下去的数，可以直接在下面的程序上面用
    public static int starLine(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("**");
        }
        System.out.println(" ");
        return number;

    }
    //上面这个就很有意思，方法有返回值，套用一个打印,然后就会打印出星星跟着一个数值，加上换行之后，星星和数字还会分开

}
