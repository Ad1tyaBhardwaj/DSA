public class BinarySearch {

    public static int bSearch(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                 high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] temp = {10,20,30,40,50};
        System.out.println(bSearch(temp,25));
    }
}