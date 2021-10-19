package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	// 写一个程序判断3-21闭区间内的所有偶数，如果是就打印出来
        int start = 2;
        int end = 21;
        while (start <= end) {
            start++;
            if(!isEvenNumber(start)) {
                continue;
            }
            System.out.println("Even number " + start);
        }
        //判断3-21闭区间，但是我却用的是2开始的，因为想要筛选3，不想3被跳过，2和3都是小于21的，所以可以这么写
        //continue就是重头再开始这个loop

        int number = 2;
        int count = 0;
        while (number ！= 5) {
            number++;
            //为什么number++要写在前面，因为写在后面的话会被continue直接跳过
            //为什么count++可以写在后面，因为计算的是偶数的个数，只有是偶数才会运行下面的代码，才会相加
            if(!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            count++;
        }
        System.out.println("The total number of even numbers is " + count);

        System.out.println(" ");
        start = 2;
        end = 21;
        count = 0;
        while (start < end) {
            start++;
            if(!isEvenNumber(start)) {
                continue;
            }
            System.out.println("Even number " + start);
            count++;
            if(count == 5) {
                break;
            }
        }
        System.out.println("The total number of even numbers is " + count);
        //上面这个程序是说，在区间内找到5个偶数之后就停止
    }
    //上面这个程序就筛选了2-5开区间内的偶数，并打印，并计算偶数的个数
    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
