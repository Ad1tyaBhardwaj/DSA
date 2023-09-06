import java.util.Arrays;

public class manveer {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Arrays.sort(nums);
            int[] arr = new int[2];
            int i=0; int j = nums.length-1;
            while(i<j){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                else if(nums[i]+nums[j]<target){
                    i++;
                }
                else{
                    j--;
                }
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {};
    }
}