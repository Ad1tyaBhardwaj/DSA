import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class numbers {

    public static int countDigits(int num){
        int res = 0;
        while(num>0){
            num = num/10;
            res++;
        }
        return res;
    }

    public static int revNumber(int num){
        int rev = 0;
        while(num !=0){
            int t = num%10;
            rev = rev*10 + t;
            num = num/10;
        }
        return rev;
    }

    public static boolean isPalindromeNum(int num){
        if(num == revNumber(num)){
            return true;
        }
        return false;
    }

    public static int factorial(int num){
        int res = 1;
        for(int i=2;i<=num;i++){
            res = res*i;
        }
        return res;
    }

    public static int trailing0sFact(int num){
        int res = 0;
        for(int i=5; i<=num;i=i*5){
            res = res + num/i;
        }
        return res;
    }

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2;i*i<num;i++){
            if(num%i == 0){
                return false;
            }
            continue;
        }
        return true;
    }

    public static void printPrimeFactor(int num){
        if(num<=1){
            return;
        }
        for (int i=2;i*i<=num;i++){
            while(num%i == 0){
                System.out.print(i+ " ");
                num = num/i;
            }
        }
        if(num>1){
            System.out.println(num);
        }
    }

    public static void printDivisor(int num){
        for(int i=1; i*i<num; i++){
            if(num%i == 0){
                System.out.print(i+" ");
                if(i != num/i){
                    System.out.print((num/i)+" ");
                }
            }
        }
    }

    public static void sieve(int n) {
        if(n <= 1)
            return;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for(int i=2; i*i <= n; i++) {
            if(isPrime[i]) {
                for(int j = 2*i; j <= n; j = j+i) {
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i<=n; i++) {
            if(isPrime[i])
                System.out.print(i+" ");
        }
    }


    public static void main(String[] args) {
//        System.out.println(countDigits(234));
//        System.out.println(revNumber(123));
//        System.out.println(isPalindromeNum(1231));
//        System.out.println(isPalindromeNum(12321));
//        System.out.println(factorial(5));
//        System.out.println(trailing0sFact(251));
//        System.out.println(gcd(12,15));
//        //Trick for LCM
//        //a*b = gcd(a,b) * lcm(a,b)
//        System.out.println(lcm(4,6));
//        System.out.println(isPrime(34));
//        System.out.println(isPrime(7));
//        printPrimeFactor(35);
//        printDivisor(15);
        sieve(10);



    }
}
