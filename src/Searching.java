public class Searching {

    public static int iElementRotated(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[low] < arr[mid]){
                if(x>arr[low] && x< arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(x>arr[low] && x< arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {100,200,300,400,500,10,20};
        int x = 200;
        System.out.println(iElementRotated(arr,20));
    }
}
