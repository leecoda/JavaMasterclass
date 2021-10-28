package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static int getDigitCount(int number) {
        if(number < 0) {
            return -1;
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
