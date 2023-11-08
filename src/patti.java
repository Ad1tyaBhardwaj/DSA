import java.util.Arrays;

public class patti {

    public static String replaceeee(String str,int x){
        String temp = "";
        temp = temp+str.substring(0,x);
        temp = temp+"100";
        temp = temp+str.substring(x+3);
        return temp;
    }

    public static String asalSolution(String a){
        String[] arr = new String[a.length()-1];
        arr[a.length()-2] = a;
        for(int i=0;i<a.length()-2;i++){
            arr[i] = replaceeee(a,i);
            asalSolution(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr[0];
    }

    public static void main(String[] args) {
        String a = "110";
        System.out.println(a);
        System.out.println(asalSolution(a));
    }
}
