package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                if(first) {
                    first = false;
                    max = number;
                    min = number;
                }
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
            //这个的设置就是处理后面的换行符
            //我第一次写的时候写错了，是因为写成了nextInt
            //对于为什么要这么写还是不是很懂，要再了解一下
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
        scanner.close();
        //上面关闭scanner的符号我也不是很明白
    }
}
//这个题目的知识点就是一个flag variable的运用，在第一次的时候让min和max都等于输入的第一个数，第二次的时候就是和第一个数进行比较，这样逻辑就顺了
//第一次做这个题目的时候，我并不能做出来，主要是因为自己对语法点不熟，多写多接触才是最重要的
//这个题目还有另一种做法，见另一个程序
