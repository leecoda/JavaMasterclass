package GrowingProgrammer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth:");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();
            //这一行是必须要加的，如果没有这一行的话，下面输入名字的那行代码就会被自动跳过； handle next line character
            //（enter key）
            int age = 2021 - yearOfBirth;
            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            if(age >= 0 && age <= 120) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth.");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanner.close();
    }
}
