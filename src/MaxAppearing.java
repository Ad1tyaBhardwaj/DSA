public class MaxAppearing {

    public static int maxAppear(int[] left, int[] right, int n){
        int freq[] = new int[100];
        for(int i=0; i<n;i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }
        int res = 0;
        for(int i=1; i<100;i++){
            freq[i] = freq[i-1]+freq[i];
            if(freq[i]>freq[res]){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {50,60,70,30};
        System.out.println(maxAppear(a,b,4));
    }
}
