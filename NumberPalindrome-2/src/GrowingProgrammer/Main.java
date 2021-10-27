package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int number) {

        int digit = 0;
        int reverse = 0;
        for(int temNumber = number; Math.abs(temNumber) > 0; temNumber = temNumber / 10) {
            digit = temNumber % 10;
            reverse = reverse * 10 + digit;
        }
        return reverse == number;
    }

}
