package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return  -1;
        }
        int remainder1 = 0;
        int remainder2 = 0;
        int commonAdvisor = 0;
        for(int i = 1; i <= first && i <= second; i++) {
            remainder1 = first % i;
            remainder2 = second % i;
            if(remainder1 == 0 && remainder2 == 0) {
                commonAdvisor = i;
            }
            //其实最难的地方就是这个点，怎样筛选出最大的值
            //只有是公约数的时候才会被记录，随着i的增加，被筛选出来的公约数的数量也在增加，最后一个可行的公约数一定是最大的
        }
        return commonAdvisor;
        //这个地方需要注意的是要返回最大公约数commonAdvisor而并不是i，因为i应该两个数中比较小的那个，而不是公约数
    }
}
