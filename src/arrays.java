import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class arrays {

    public static boolean isSorted(int[] arr){
        boolean flag = true;
        for(int i =1; i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static int largestIdx(int[] arr){
        int res = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                res = i+1;
            }
        }
        return res;
    }

    public static int largestElm(int[] arr){
        int res = -1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                res = i+1;
            }
        }
        return arr[res];
    }

    public static int secondLargest(int arr[]) {
        int largest = largestElm(arr);
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != largest) {
                if (res == -1 || arr[i] > arr[res]) {
                    res = i;
                }
            }
        }

        return arr[res];
    }

    public static int[] revList(int[] arr){
        int low=0;
        int high = arr.length-1;
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr1 = {3,4,5,2,8,6,9};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = new int[5];
        arr3[0] = 2;
        arr3[1] = 3;
        arr3[2] = 4;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr2));
        System.out.println(isSorted(arr2));
        System.out.println(largestIdx(arr1));
        System.out.println(largestIdx(arr2));
        System.out.println(secondLargest(arr1));
        System.out.println(secondLargest(arr2));
        System.out.println(Arrays.toString(revList(arr1)));
    }
}
