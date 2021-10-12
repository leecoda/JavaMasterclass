package GrowingProgrammer;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, a 4, or a 5");
                System.out.println("Actually the value was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4, or 5");
                break;
        }

        char switchChar = 'A';
        switch (switchChar) {
            case 'A':
                System.out.println("The answer is A");
                break;
            case 'B':
                System.out.println("The answer is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("The answer is C, D, or E");
                break;
            default:
                System.out.println("No answer is found");

        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
        //上面这个例子是用string变量的一个程序，输入两个月份，输出缩写
        //如果switch后面的括号里面跟的只是month的话，那么这个变量的写法是要区分大小写的，必须要跟下面case后面的写法是一模一样的
        //但如果我在month后面加上一个功能，.toLowerCase(),那么这个变量里面所有的字母就会统一转化成小写
        //这个时候case后面的单词的写法也全部编程小写，就可以进行比较的，如果相同就会运行后面的代码
    }
}
//如果break忘记加了，就会运行到下一个break
//比如switchValue等于3，而相对应的case下面忘记加break，代码就会运行到default下面的break
//上面还有一个我不是很熟悉的技术点是，case并列

//这里我还犯了一个错误就是char变量的赋值是需要用单引号的
