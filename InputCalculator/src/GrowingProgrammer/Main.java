package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int i = 0;
        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                i++;
                average = Math.round((double)sum / i);
                //如果没有casting，就会直接取整，3.9也会变成3
                //casting之后再round就能够取近似值
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + "AVG = " + average);
        scanner.close();
    }

}
//输入数字叠加就是求和，求和再除以个数就是平均数
//这里面有个点需要考虑的是，average应该是不用放到循环里面的，因为只要有了最后的得数，就可以再最后打印的
//时候计算出来就好了
