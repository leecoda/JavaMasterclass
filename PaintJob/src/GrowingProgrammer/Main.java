package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
        System.out.println(" ");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(" ");
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0) {
            return -1;
        }
        return (int) (Math.ceil(width * height / areaPerBucket) - extraBucket);
        //这里需要注意的一个点就是，Math.ceil是向上取整，但是不会改变数字的属性，所以还是double，最后是要casting一下的
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return (int) (Math.ceil(width * height / areaPerBucket));
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if(area <= 0 || areaPerBucket <=0) {
            return -1;
        }
        return (int) (Math.ceil(area / areaPerBucket));
    }
}
