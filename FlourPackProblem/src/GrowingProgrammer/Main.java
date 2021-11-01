package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(" ");
        System.out.println(pack(1, 0, 4));
        System.out.println(pack(1, 0, 5));
        System.out.println(pack(0, 5, 4));
        System.out.println(pack(2, 2, 11));
        System.out.println(pack(-3, 2, 12));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return  false;
        }
        return (goal < 5 && smallCount >= goal) || (goal == 5 && bigCount >= 1) || (goal == 5 && smallCount >= 5) || (goal > 5 && bigCount ==0 && smallCount >= goal) || (goal > 5 && goal >= (5 * bigCount) && bigCount >0 && smallCount >= (goal - 5 * bigCount) ) || (goal > 5 && (5 * bigCount) == goal) || (goal > 5 && (5 * bigCount) > goal && smallCount >= (goal % 5));
        //这个解题办法实际上就是把可能的情况都列举一遍，可读性是比较差的，别的程序员在看的时候回看不明白
        //但是这个程序有一定的简洁性在里面，return写得不错
    }
    public static boolean pack(int x, int y, int z) {
        if(x < 0 || y < 0  || z < 0) {
            return false;
        }
        if(5 * x <= z) {
            return (z - (5 * x)) <= y;
        } else {
            return (z % 5) <= y;
        }
    }
}
//第二种解法就简洁很多，关键是要如何才能得到这样的算法呢？

