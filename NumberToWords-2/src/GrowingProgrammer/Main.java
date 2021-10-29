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
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
        }
        if(number == 0) {
            return 1;
        }
        int count = 0;
        int digit = 0;
        while(number >= 1) {
            digit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
    public static int reverse(int number) {
        int digit = 0;
        int newNumber = 0;
        while(Math.abs(number) >= 1) {
            digit = number % 10;
            newNumber = newNumber * 10 + digit;
            number /= 10;
        }
        return newNumber;
    }
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        } else if(number == 0) {
            System.out.println("Zero");
        } else {
            int i = getDigitCount(number);
            number = reverse(number);
            //这个地方需要注意两个地方，在转换数字方向之前，要先算数字个数，否则100这样的数字个数就会出错
            //这个地方还需要注意的是数字要反向，因为下面的算法是从最后一个digit开始打印的
            int digit = 0;
            int count = 0;
            while(number >= 1) {
                digit = number % 10;
                switch(digit) {
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
        }
    }
}
/*提取数字的算法梳理

取最后一个digit，就是除以10的余数
除以10之后取整，就是一个去除了最后一个数字的数
再取余，就是第二个数字
再取整，就是去除了最后两位的数字
。。。
当取到最后一个数字的时候，取余就是这个数字，取整就是0
这个时候所有的数字都已经提取出来了，取整为0的时候就应该停止循环，所以判断条件为number > 0, 或者是 number >= 1,都是成立的

-------------------------------------------

如果说是计算数字的个数，只要是在上面的程序中加入一个count计数变量即可，因为上面的程序是有几个数字就会循环几次，所以count起始值可以设为0，然后叠加就好了

如果计算负数的数字个数，那么是需要在判断条件中把数字转换成绝对值

0的话是需要单独列出来的，因为不满足判断条件>0 或者 >= 1

-------------------------------------------

更换数字方向

这个算法就是最后一个数字（余数），乘以10
然后加上第二个数字
然后再乘以10升位，再加第三个数字

。。。
总之逻辑就是乘以10升位

判断方法还是number 以及后面 number / 10取整大于0或者大于等于1

---------

打印数字单词

小于0，无效值
等于0，输出zero
大于0的时候，先计算个数，然后转换数字方向，然后通过一个循环结构打印数字

这里面有一个意外就是有的类似于100，1010的数字，在转换方向之后，和之前不一致，变成了1和101
在进行打印的时候用switch statement
并打印的个数

解决这个问题就是，看看打印的次数，和转向前数字的个数是不是一致，不一致就补0，直到一致就停止
也就是说会补数字个数-打印个数个
while后面加上（count ！= i ）就可以了，因为count这个数字本身也是会运行一遍 */
