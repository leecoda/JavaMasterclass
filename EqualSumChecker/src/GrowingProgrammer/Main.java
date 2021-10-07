package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    boolean equalSum = hasEqualSum(1, 1, 1);
        System.out.println(equalSum);
        equalSum = hasEqualSum(1, 1, 2);
        System.out.println(equalSum);
        equalSum = hasEqualSum(1, -1, 0);
        System.out.println(equalSum);
    }
    public static boolean hasEqualSum(int first, int second, int third) {
        boolean equalOrNot = false;
        int sum = first + second;
        if (sum == third) {
            equalOrNot = true;
        }
        return equalOrNot;
    }
}
//需求：输入三个数，过程验证第一个数和第二个数相加是否等于第三个，输出是否
//设计：基本的设计和之前的练习是一样的，就是这里的算法是不同的，把第一个数和第二个数相加，判断这个和和第三个数是否是一致的
//这次审题比之前仔细，解题的速度也进步了很多
