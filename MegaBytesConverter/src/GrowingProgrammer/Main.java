package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);

    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainKiloBytes + " KB");
        }
    }
}
//上面的还是可以拆分成三个method的，但没有必要这么做，因为这个是两个程序就能完成的
//需求：输入kb值输出MB值和余下的KB数
//设计：
    // 一个主method
    // 一个处理打印程序
    // method传过来kb值，进行判断，小于0，就是无效值，输出无效值；大于等于0，除法取整就是mb的值，取余数，就是kb值，最后按要求输出整数和余数
