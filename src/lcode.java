import java.util.Arrays;

public class lcode{
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2;i++){
            if(arr[i]-arr[i+1]!=arr[i+1]-arr[i+2]){
                return false;
            }
            continue;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
