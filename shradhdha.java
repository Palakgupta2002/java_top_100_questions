import java.util.Arrays;

class shradhdha{
    public static void main(String []args){
        //Maximum and Minimum Element in an Array
        int Array[]={4,6,9,1,0,8,2};
        minmax(Array);

    }
    public static void minmax(int Array[]){
        Arrays.sort(Array);
        System.out.println(" Min "+Array[0]+" Max "+Array[Array.length-1]);
    }
    //leetcode easy 
    class Solution {
    public int removeElement(int[] nums, int val) {
          int k = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        int si = 0;
        int ei = nums.length - 1;

        while (si <= ei) {
            int mid = si + (ei - si) / 2; 
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }

       
        return si;
    }
}