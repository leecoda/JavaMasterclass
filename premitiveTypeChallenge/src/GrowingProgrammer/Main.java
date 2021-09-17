package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {

        byte myTestByte = 10;
        short myTestShort = 30;
        int myTestInt = 100;
        long myTestLong = 50000L + 10L * (myTestInt + myTestShort +myTestByte);
        System.out.println(myTestLong);
        short shortTotal = (short) (1000 + 10 * (myTestInt + myTestShort +myTestByte));
        System.out.println(shortTotal);
    }
}
