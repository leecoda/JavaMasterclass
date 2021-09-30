package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    int first = 50;
        //the entire line is a statement
        first++;
        first--;
        System.out.println("This is a test!");
        //each line is a statement, ending with semicolon
        System.out.println("This is" +
                " another" +
                " still more.");
        //a statement can be across several lines, like above. 但是记住➕一定是要放到末尾的
        int second= 50; first--;System.out.println("This is another one.");
        //上面一行之内有多个statements，上面还是有效的
        int            third
                =
                50;
        //上面的这个程序并不readable，但是说明java会自动忽略空格，依然是有效的；
        //indenting即使是没有的话，也是可以运行的，但是就是可读性会变差




    }
}
