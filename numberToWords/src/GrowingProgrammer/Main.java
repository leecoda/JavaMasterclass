package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(" ");
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println(" ");
        numberToWords(-12);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);

    }
    public static int getDigitCount(int number){
        if(number < 0) {
            return -1;
        }
        int count = 1;
        while(number / 10 >= 1) {
             count ++;
             number = number / 10;
        }
        return count;
        //这里比较麻烦的是计算数字这个算法
        //可以这么想，输入的本身就是一个数字，所以至少有一位，count起始值为1；
        //对于一个十进制的数来说，如果除以10的得数大于等于1小于10，就是一个两位数，count应该加1
        //减一位之后（通过将number替换为number / 10），重复循环，每得数大于等于1的时候，count就加1

    }
    public static int reverse(int number) {

        int digit = 0;
        int newNumber = 0;
        while(Math.abs(number) >= 1) {
            digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number = number / 10;
        }
        return newNumber;
    }
    //其实上面这个程序我是写过的，算法的核心就是除以10结果的绝对值只要大于等于1，就是前面还有一位
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        } else {
            int i = getDigitCount(number);

            number = reverse(number);

            int digit = 0;
            int count = 0;

            while(number >= 1) {
                digit = number % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    default:
                        System.out.println("Nine");
                }
                count++;
                number /= 10;
            }
            while(count != i) {
                System.out.println("Zero");
                count++;
            }
            //上面这个还是用while loop会比较合适，因为i的值是要在reverse程序运行之前就确定的，count的值也是确定的
            //如果用for的话，可能需要写成 for（count； count ！ = i； count++）{...}
            //可以测试一下
        }
    }
}
//最后一个确实是比较复杂一些，里面有三个方面的内容需要考虑，一个是number = 0；是一种特殊情况，需要特殊对待
//再一个是这个是直接打印的程序，所以是没有return 机制中断程序的，我需要用if else结构来继续
//用返回值的话，也是不合适的，因为返回值智能返回一个结果，而这个程序是要反复打印才可以的