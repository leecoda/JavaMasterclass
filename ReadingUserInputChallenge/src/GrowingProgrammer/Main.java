package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int number = 0;
        int sum = 0;

        while(i <= 10) {

            System.out.println("Enter number #" + i + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                number = scanner.nextInt();
                sum += number;
                i++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();//handle end of line(enter key)
        }
        System.out.println("The sum of the 10 numbers is " + sum);
        scanner.close();
    }
}
//这个题目最大的难题在于hasNextInt的位置以及scanner.nextLine的作用
//走一遍程序，当让我输入第一个数字的时候，我输入的不仅仅是数字1，同时还有回车键/n,所谓的enter key
//换行符号就会在buffer里面，被一直认为是输入的内容,然后再hasNextInt判断的时候总认为是不合格的，打印出
//invalid number，然后反复让你输入第一个数字

//在前面一个程序写作的时候，在整数输入之后再下一次输入之前就必须要加一个这个输入的东西

//还有一个问题就是 hasNextLine的位置，我现在摸索到的位置就是两者不能分开，必须放到一起

//还有最后一个close这个环节，scanner是需要关闭，但是是为什么呢？