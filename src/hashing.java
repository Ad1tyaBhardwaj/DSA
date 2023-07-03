import java.util.HashSet;

public class hashing {

    public static int ZeroSumSubarray(int arr[], int n){
        HashSet<Integer> h = new HashSet<>();
        int prefix_sum = 0;
        h.add(0);
        for(int i=0; i<n;i++){
            prefix_sum += arr[i];
            if(h.contains(prefix_sum) == true){
                return 1;
            }
            h.add(prefix_sum);
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,4,3,-1,1};
        int n = arr.length;

        System.out.println(ZeroSumSubarray(arr, n));
    }
}
