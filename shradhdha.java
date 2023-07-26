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