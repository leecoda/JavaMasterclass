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
        //这里还有一个打印的办法
        int highScore = newScore(false, 100, 3, 200);
        System.out.println("The high score can be printed as " + highScore);
        //这样来打印返回值就方便多了

        star(5);
        System.out.println(" ");
        System.out.println(starLine(5));
        //这里还有一个办法来实现在主程序中高效打印
        //先是给副方法赋值，然后再打印到新赋值的变量中去
        int stars = starLine(5);
        System.out.println(stars);
        //这里有个很有意思的地方，就是我虽然副程序返回的是int，但实际返回的是星星加上int，但是我在赋值新变量的时候用的只是int
        //最后打印出来也是星号加上int
        //可以看出来这个地方的规则就是副程序的返回值属性和主程序中新赋值的属性必须是一致的
        int position1 = calculateHighScorePosition(1500);
        int position2 = calculateHighScorePosition(900);
        int position3 = calculateHighScorePosition(400);
        int position4 = calculateHighScorePosition(50);
        //这里有一个问题就是，我为了高分位置这一个变量定义了4个变量，每个整数变量在电脑上都有占用存储空间，这样是不利于电脑的有效运转的

        displayHighScorePosition("player1", calculateHighScorePosition(1500));
        displayHighScorePosition("player2", position2);
        displayHighScorePosition("player3", position3);
        displayHighScorePosition("player4", position4);
        //对于string这种变量来说，很重要的一点就是变量类型中的S是要大写的，后面的名称和其他变量名称差不多
        //但是赋值的时候，一定要记住双引号

        //上面程序的功能分析，有一个功能是打印，给人名和位置，打印什么人在高分表上第几位
        //第二个程序功能分析，给一个数字，然后计算出位置
        //两个都是副方法，在主方法中，调用这两个方法。从上面的功能分析可以看出，我是要用计算位置的程序所返回的值当做调用打印程序
        //的参数
        //直接在调用程序的括号里面套程序当然可以，就像是上面第一个1500那个一样，但是可读性就会比较差
        //还是按照之前学过的，把程序先进行一个赋值转换，然后再作为参数调用下一个程序就可以了
        //在进行功能分析的时候，有一个点非常重要，就是谁是谁的调用参数，谁先发生，弄清楚之后就可以安排这些方法的顺序了

        //上面的变量是可以进行改进的，还是要体会变量是一个盒子，可以放不同的值
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Emma", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Emily", highScorePosition);
        highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Lucy", highScorePosition);
        //上面就是用复制黏贴就可以了，可以省去很多时间
        //只定义了一个整数变量，可以通过不断的赋值，可以重复利用这个变量，原理就是箱子可以反复使用这个原理
        //注意int不用写两遍

    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
    //之前写方法的时候就注意到了，参数框其实是有定义变量的作用

//    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500 && score < 1000) {
//            return 2;
//        } else if (score >= 100 && score < 500) {
//            return 3;
//        } else {
//            return 4;
//        }
//
//    }
    //上面的程序还是有一点问题的，可以看到else if里面的语句是有高亮的，把鼠标放上去就能看到是因为if后面的数值已经排除了1000以上
    //的数字了，到else if的时候，这个条件已经是默认的了，所以更为简洁的办法是直接写大于等于500就可以了，下同
    //这个是else if语句在使用的时候必须要考虑的一个问题
    //下面是正确的一个示范
//    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//
//    }
    //还有一个问题就是最后的else的那个返回值可以直接放到if语句之外，这样做和放到else里面是一样的，逻辑可读性上感觉放到else里面会更容易理解
    //    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
//
//    }
    //上面的这种写法还有一个问题就是有很多的return值，可读性还是差了一点，还有一种办法可以让代码更容易懂一些
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
    //上面这种写法就好了很多，很重要的一个原因就是我们能够看到返回的是position，并且只有一个值会返回，前面都只是筛选条件
    //这个地方为什么要设置变量，因为导入的数字是score，position确实是一个新变量，需要设置
    //用一个变量代替后面诸多的return，还是用的变量是盒子可以放很多值，多次重复利用这样一种思想
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver == true) {
            //❤可以看到上面的gameOver还是被高亮了，还是因为写的代码有冗余，这个时候boolean直接可以简写成为变量名称就可以了
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
