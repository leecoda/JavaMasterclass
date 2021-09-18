package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    // byte - uncommonly used
        // short - uncommonly used
        // long - less commonly used
        // int - commonly used
        // float - uncommonly used
        // double - commonly used
        // char - less commonly used
        // boolean - commonly used

        //Class - a data type created by the users, will talk more later
        //String - treated as a data type, a class in fact, much easier to use than regular class
        //String is immutable
        //String contains a sequence of characters. It is limited by memory or the max value of int.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.45";
        System.out.println(numberString );

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);




    }
}
