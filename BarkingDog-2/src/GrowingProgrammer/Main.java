package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        boolean wakeUp = shouldWakeUp(true, 1);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(false, 2);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, 8);
        System.out.println(wakeUp);
        wakeUp = shouldWakeUp(true, -1);
        System.out.println(wakeUp);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean wakeOrNot = false;
        if (!barking) {
            wakeOrNot = false;
        } else if (hourOfDay >= 0 && hourOfDay < 8) {
            wakeOrNot = true;
        } else if (hourOfDay > 22 && hourOfDay <= 23) {
            wakeOrNot = true;
        }
        return wakeOrNot;
    }
    //这是另一个练习的拓展版，这个的特点就是用if-else if进行一个大范围框定
    //对于这个练习来说，狗叫是一个demanding条件的大前提
    //对于闰年那个练习来说在0-9999的闭区间是一个demanding条件的大前提
    //使用if-else if来进行大范围框定，有一个好处就是判断条件的可读性更高
}
