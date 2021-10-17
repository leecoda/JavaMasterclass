package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
        for (int n = 10; n < 101; n++) {
            if (isPrime(n)) {
                System.out.println(n + " is a prime number.");
                count++;
                if (count ==3) {
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
          if (n % i == 0)  {
              return false;
          }
        }
        return true;
        //这里要记住，return true是不能放到for loop里面去的，否则的话会重复运行
        //这里要做到的是，经过前面的筛选条件，没有被筛下去的就是true
    }
}
