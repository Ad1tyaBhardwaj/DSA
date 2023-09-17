import java.lang.reflect.Array;
import java.util.Arrays;

public class revision {
    public static int candy(int[] ratings){
        int[] arr = new int[ratings.length];
        int idx = 0;
        for(int i=0;i<ratings.length;i++){
            if(ratings[i]<ratings[idx]){
                idx = i;
            }else{
                continue;
            }
        }
        arr[idx] = 1;

        //Go Right
        for(int i=idx+1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                arr[i] = arr[i-1]+1;
            }
            else{
                if(arr[i-1] != 1){
                    arr[i] = arr[i-1]-1;
                }
                else{
                    arr[i] = 1;
                }
            }
        }

        //Go Left
        if(idx != 0){
            for(int i=idx;i>=0;i--){
                if(ratings[i]>ratings[i+1]){
                    arr[i] = arr[i+1]+1;
                }
                else{
                    if(arr[i+1] != 1){
                        arr[i] = arr[i+1]-1;
                    }
                    else{
                        arr[i] = 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res+arr[i];
        }
        System.out.println("SUM is: "+res);
        return res;

    }

    public static void main(String[] args) {
        int[] ratings = {1,3,2,2,1};
        System.out.println("QUESTION: " +Arrays.toString(ratings));
        System.out.println(candy(ratings));

    }
}