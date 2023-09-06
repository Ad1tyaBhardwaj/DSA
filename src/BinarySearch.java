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

    public static int RbSearch(int arr[], int low, int high, int x){
        if (low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return RbSearch(arr,low,mid-1,x);
        }
        else{
            return RbSearch(arr,mid+1,high,x);
        }
    }

    public static int FirstOccourence(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] < x){
                low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                if(mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] temp = {10,20,30,40,50};
        System.out.println(bSearch(temp,25));
        System.out.println(RbSearch(temp,0,4,30));
        int[] temp2 = {10,10,20,20,40,40,50};
        System.out.println(FirstOccourence(temp2,20));
    }
}