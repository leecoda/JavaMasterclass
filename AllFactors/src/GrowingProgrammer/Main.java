package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        System.out.println(" ");
        printFactors(32);
        System.out.println(" ");
        printFactors(10);
        System.out.println(" ");
        printFactors(-1);
    }
    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
        }

        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                System.out.println(i);
            }
        }
//        int i = 1;
//        while(i <= number) {
//            if(number % i == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
    }
}
//上面两个loop运行结果是一样的
//for loop更加简洁，也更合适，因为判断次数是比较固定的
