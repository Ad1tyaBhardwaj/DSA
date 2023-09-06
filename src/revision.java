import java.math.*;

public class revision{

    public static void Nto1(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        Nto1(n-1);
    }

    public static void OnetoN(int n){
        if(n == 0){
            return;
        }
        OnetoN(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if(n>=1){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }

    public static int NaturalNoSum(int n){
        if(n>0){
            return n+NaturalNoSum(n-1);
        }
        else{
            return 0;
        }
    }

    public static boolean checkPalindrome(String str, int start, int end){
        if(start>=end){
            return true;
        }
        return (str.charAt(start) == str.charAt(end) && checkPalindrome(str,start+1,end-1));
    }

    public static int sumOfDigits(int n){
        if(n==0){
            return 0;
        }
        else{
            return sumOfDigits(n/10)+ n%10;
        }
    }

    public static int getSum(int n){
        int res = 0;
        while(n>0){
            res = res + n%10;
            n = n/10;
        }

        return res;
    }

    public static int maxPieces(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        }
        else if(n <= -1){
            return -1;
        }
        int temp1 = maxPieces(n-a,a,b,c);
        int temp2 = maxPieces(n-b,a,b,c);
        int temp3 = maxPieces(n-c,a,b,c);

        int res = Math.max(temp3,Math.max(temp1,temp2));
        if (res == -1){
            return -1;
        }
        return res+1;

    }

    public static void genSubset(String str){

    }

    public static void main(String[] args) {
        Nto1(5);
        OnetoN(5);
        System.out.println();
        System.out.println(fact(5));
        System.out.println(NaturalNoSum(5));
        System.out.println(checkPalindrome("aditya",0,5));
        System.out.println(sumOfDigits(123));
        System.out.println(getSum(123));
        System.out.println(maxPieces(5,2,2,5));
    }
}