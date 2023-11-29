import java.util.Scanner;

public class bitmanu {

    public static void isSet(int n, int k){
        if((n&(1<<k-1)) != 0){
            System.out.println("Set");
        }else{
            System.out.println("Not Set");
        }
    }

    public static void main(String[] args) {
        isSet(5,2);
        isSet(5,3);
        System.out.println(5^6);
    }

}