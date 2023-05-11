import java.util.Arrays;

class lcode {

    public static int score(int[] arr){
        int score = 0;
        for(int i=0;i<arr.length;i++){
            score = score+arr[i];
        }
        return score;
    }

    public static int max(int[] arr,int l){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<l-1; i++){
            if(arr[i]<arr[i+1]){
                max = arr[i+1];
            }
        }
        return max;
    }

    public static int[] conv(int[] arr, int l){
        int[] temp = new int[l];
        for(int i=0;i<l;i++){
            temp[i] = arr[i] + max(arr, l);
        }
        return temp;
    }

    public static int[] findPrefixScore(int[] nums) {
        int[] sol = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            int[] tri = new int[i];
            tri = conv(nums,i);
            sol[i] = score(tri);
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,7,5,10};
        System.out.println(Arrays.toString(findPrefixScore(arr1)));
    }

}