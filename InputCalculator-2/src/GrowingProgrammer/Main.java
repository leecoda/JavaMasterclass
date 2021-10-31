package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while(true) {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long average = Math.round((double)sum / count);
        //这个放到后面对于赋值，规定属性，是一个比较简洁的做法
        System.out.println("SUM = " + sum + " AVG =" + average);
        scanner.close();
    }
}
