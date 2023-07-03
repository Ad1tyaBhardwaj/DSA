import java.util.Arrays;

public class pla {

    public static boolean togle(boolean p){
        if(p == true){
            return false;
        }
        return true;
    }

    public static void togleSwitch(int n){
        boolean[] res = new boolean[6];
        int dbug[] = new int[6];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                dbug[i] =j%i;
                if(j%i == 0){
                    res[i] = togle(res[i]);
                }
            }

            System.out.println(Arrays.toString(dbug));
        }
    }

    public static void main(String[] args) {
        boolean temp[] = new boolean[5];

        temp[3] = togle(temp[3]);
        System.out.println(Arrays.toString(temp));
        togleSwitch(5);
    }
}