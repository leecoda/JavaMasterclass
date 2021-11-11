package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        //这个其实不是很懂
        porsche.setModel("Carrera");
        //为什么这样就能给保时捷设定一个型号呢？
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
