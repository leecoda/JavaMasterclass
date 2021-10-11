package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean playOrNot = false;
        if (summer && temperature >= 25 && temperature <= 45) {
            playOrNot = true;
        } else if (!summer && temperature >= 25 && temperature <= 35) {
            playOrNot = true;
        }
        return playOrNot;
    }
}
//这个地方用到的技术点就是之前说的，先设定一个boolean默认值，然后进行条件筛选，如果满足就修改默认值，如果不满足就保持默认值
//最后返回设置的boolean变量，这样做的好处就是不需要多次返回，可读性强
//还有一个知识点就是Boolean变量在if语句中的写法，肯定式和否定式
