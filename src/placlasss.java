import java.util.Arrays;
import java.util.HashSet;

public class placlasss {
    public static boolean canCross(int[] stones) {
        int[] dist = new int[stones.length];
        for(int i=1;i<stones.length;i++){
            dist[i]=stones[i]-stones[i-1];
        }
        System.out.println("Arr is: "+ Arrays.toString(stones));
        System.out.println("Dist is:"+ Arrays.toString(dist));

        for(int i=0; i<dist.length;i++){
            int prev;
            if(dist[i]==0){
                prev = 0;
            }
            else{
                prev = dist[i-1];
            }
            HashSet<Integer> set = new HashSet<>();
            System.out.println("PRev: "+prev);
            set.add(prev-1);
            set.add(prev);
            set.add(prev+1);
            System.out.println("HashSet is"+set);
            System.out.println("Data is:"+dist[i] );
            System.out.println();
            if(set.contains(dist[i])){
                continue;
            }
            else{
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] temp = {0,1,3,5,6,8,12,17};
        canCross(temp);
    }
}