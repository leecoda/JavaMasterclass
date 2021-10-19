package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-1));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(312123));
    }
    public static int sumDigits(int number) {
        if(number < 10) {
            return -1;
        }
        int digitSum = 0;
        int digit = 0;
        while(number > 0) {
            digit = number % 10;
            digitSum += digit;
            number /= 10;
        }
        return digitSum;
    }
}
//上面这个函数才是最好的
//一个本质，反复除以10的余数相加就是结果，所以循环体内的前两步都反应了这一点
//取整后反复取余，就是循环体内的第三步

//这个好简洁
