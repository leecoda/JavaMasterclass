package GrowingProgrammer;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(420));

    }
    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }
        int tempNumber = 0;
        for(int f = 2; f <= number; f ++) {
            boolean prime = true;
           if(number % f == 0) {
               //boolean prime = true;
               //之前420的最大质因数7不能筛选出来一个很重要的原因是prime的赋值是for loop外侧的，这样的话，一旦出现一个非质因数，比如420的4，那么prime就会被赋值false，之后的质因数就不会再被记录这样的情况
               //解决办法就是每一个f是否是质数检测之前，prime需要重新设置为默认值true
               //那么这个重新回到默认值的位置，可以是素数筛查之前，比如上面，if里面，还有一个可能的位置是if 外面，for里面，最重要的是一定要在叔叔筛查之前
               for(int i = 2; i <= Math.sqrt(f); i++) {
                   if(f % i == 0) {
                       prime = false;
                       break;
                       //break打破的只有一层for loop，证据就是最后一个数字420有一个4这个因子，在break之后
                       //还是能够继续筛选，直到7被筛选出来，如果外层的for loop被打破的话，这个是不可能的
                   }
               }
               if(prime) {
                   tempNumber = f;
               }

           }
        }
        return tempNumber;
    }
}
//这个题目主要是两个步骤，第一步是确定因子，从小到大的因子
//第二步是判断因子是不是素数，如果是素数的话，就先储存起来
//一直筛到最后一个因子
//因子的主要判断标准就是余数为0，素数的判断标准就是在2-这个数的平方之间没有因子

//这个里面有一个技巧就是flag variable的运用，即boolean 变量，作用就是如果不是质数，就会打信号不是素数，然后tempNumber不会对这个因子进行记录
//如果是素数，boolean变量就还是默认值，那么这个因子就能够被记录
//所以后面还是有一个判断是不是还是默认值，如果是的话，就说明还是素数

//上面那个flag重新赋值后面加个break打破循环这种写法还是经常见的

//在最大最小值的那个练习里面也有一个flag variable，确保的是第一次输入的时候把最大最小值的起始值都设置为用户第一个输入的数字

//上面这个程序比较复杂的原因是4层嵌套，for-if-for-if，就显得很困难
//大块分解是很简单的，判断是不是因子，如果是因子的话，判断是不是素数

