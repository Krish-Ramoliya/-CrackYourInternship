package TwoPointersMethod;

import java.util.Arrays;

public class Twosum {

    public static void main(String[] args)
    {
        int nums[]={2,7,11,15};
        int target = 9;
        two ob = new two();
        int arr[] = ob.twoSum(nums,9);
        System.out.println(Arrays.toString(arr));


    }

}
class two {
    public int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;   // I think of binary search and two pointer approach together and apply it.

        while(start<=end)
        {
            if((nums[start]+nums[end])==target)
            {
                if(nums[start]<nums[end])
                {
                    return  new int[]{start+1,end+1};
                }
                else if(nums[start]<nums[end]){
                    return   new  int[]{end +1, start+1};
                }
                else{
                    return   new  int[]{start+1, end+1};
                }

            }
            if((nums[start]+nums[end])>target)
            {
                end--;
            }
            else{
                start++;
            }
        }

        return new int[]{-1,-1};
    }
}
