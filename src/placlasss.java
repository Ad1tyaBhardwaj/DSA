import java.util.ArrayList;
import java.util.Arrays;

class placlasss{

    public static boolean isPalindrome(String str){
        int p = str.length();
        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(p-1)){
                p--;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean togle(boolean b){
        if(b == true){
            return false;
        }
        return true;
    }

    public static void toggleSwitch(int n){
        boolean res[] = new boolean[n];
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(j%i == 0){
                    togle(res[i]);
                }
            }
            System.out.println(Arrays.toString(res));
        }
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("10101"));
        System.out.println(isPalindrome("101010000"));
        toggleSwitch(5);

    }
}