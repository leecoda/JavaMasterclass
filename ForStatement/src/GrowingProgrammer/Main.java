package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + fakeCalculator(10000.0, 2.0));
        System.out.println("10,000 at 2% interest = " + fakeCalculator(10000.0, 3.0));
        System.out.println("10,000 at 2% interest = " + fakeCalculator(10000.0, 4.0));
        System.out.println("10,000 at 2% interest = " + fakeCalculator(10000.0, 5.0));
        System.out.println(" ");
        for(int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
        System.out.println(" ");
        for(int e = 2; e < 9; e++) {
            System.out.println("10,000 at " + e + "% interest = " + fakeCalculator(10000.0, e));
        }
        //上面有一个点可以说，我在loop里面设置的变量的属性还是int，但是下面的method里面要求的变量属性是double，可以把e设置为double
        //也可以还是按照int来设置，java会自动把int转换成double
        //但，我还是原因直接用double，因为打印出来的时候也会很好看

        //上面还有一个点是，第一次打印出来回出现7.0的时候打印出来的结果不合规格的情况，具体原因我也不是很清楚，以后可能会知道
        //下面给了一个解决办法就是用，string.format("%.2f", .....)这样的一个解决办法
        System.out.println(" ");
        for(double d = 2.0; d < 9.0; d++) {
            System.out.println("10,000 at " + d + "% interest = " + String.format("%.2f", fakeCalculator(10000.0, d)));
        }
        //上面的这个解决办法打印出来就清晰多了
        System.out.println(" ");
        for(double f = 8.0; f > 1.0; f--) {
            System.out.println("10,000 at " + f + "% interest = " + String.format("%.2f", fakeCalculator(10000.0, f)));
        }
    }
    public static double fakeCalculator(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
