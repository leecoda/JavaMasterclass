package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);
        //下面会把2018转换成一个数字，能够成功是因为2018确实是一个数字的形式。但如果是"2018a"，java就会直接报错，因为数字形式不对
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        numberAsString = "3000.12";
        double i = Double.parseDouble(numberAsString);
        System.out.println(i);

        numberAsString += 1;
        i++;
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + i);
    }
}
