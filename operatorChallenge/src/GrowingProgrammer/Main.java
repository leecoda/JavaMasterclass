package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    double first = 20.00;
        double second = 80.00;
        double third = (first + second) * 100.00;
        double fourth = third % 40.00;
        boolean fifth = fourth == 0;
        System.out.println(fifth);
        if (!fifth) {
            System.out.println("Got some reminder");
        }

        boolean sixth = fifth ? true: false;
        System.out.println(sixth);
        if (sixth) {
            System.out.println("aha!");
        }
    }
}
