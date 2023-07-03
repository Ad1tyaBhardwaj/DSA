public class recursionL1 {

    public static void printNumsRev(int num){
        if(num == 0){
            return;
        }
        System.out.print(num+" ");
        printNumsRev(num-1);
    }

    public static void printSum(int n, int sum){
        sum+=n;
        if(n == 0){
            System.out.println(sum);
            return;
        }
        printSum(n-1,sum);
    }

    public static void printFact(int n, int fact){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        printFact(n-1,fact);
    }

    public static void printFib(int a, int b, int n){
        if(n == 0){
            return;
        }
        System.out.print(a+" ");
        printFib(b,a+b,n-1);
    }

    public static int powOfX(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = powOfX(x,n-1);
        int xn = x * x_;
        return xn;
    }

    public static void main(String[] args) {
        printNumsRev(7);
        System.out.println();
        printSum(5,0);
        printFact(5,1);
        printFib(0,1,7);
        System.out.println();
        System.out.println(powOfX(3,4));
    }
}
