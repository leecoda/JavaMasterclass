package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        //这里空一行可以增加可读性
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                //上面使用双引号也可以增加可读性
                sum += i;
                count++;
                System.out.println("Found number " + i);
                if (count == 5)
                {
                    break;
                }
            }
        }
        System.out.println("The sum of the first five found numbers is " + sum);
    }
}
