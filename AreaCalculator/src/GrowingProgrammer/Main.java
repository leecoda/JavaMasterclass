package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1.0));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
}
//需求设计一个method计算圆的面积，还要一个重载method计算矩形的面积，半径和边>=0
//设计中需要注意的点，if进行条件筛选，return返回的是面积值，return后面跟的就是面积公式
//这次读题比以前要认真一点了，虽然出了小纰漏，但主要还是题目陈述不清楚
