package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.println("Enter number:");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
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
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        scanner.close();
    }
}
//这是另一种做法，主要就是把最大值给min，同时把最小值给max
//这样在第一次运行的时候，number肯定是大于max，也肯定会小于min，min和max同时获得了第一个输入值，作为初始值。第二次的时候就开始比较了
//所以这个算法的关键就是，在第一轮的时候，把min和max整齐地赋予第一个数的值，之后和这个数进行比较
//后来老师还做了一个特别有意思的事情，就是，分别输入最大整数，和最小整数，然后break，结果就是最大值变成了最大整数，最小值编程了最小整数

