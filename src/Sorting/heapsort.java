package Sorting;

import java.util.Arrays;

public class heapsort {

    public static void main(String []args)
    {
        int[] nums= {2,0,1,8,7,6};
        Solution ob = new Solution();
        ob.sortColors(nums);

        System.out.println(Arrays.toString(nums));
    }



}
class Solution {

    public void sortColors(int[] nums) {

        int heapsize = nums.length ;
        buildheap(nums, heapsize);
        for(int i = nums.length-1;i>0 ; i--)
        {
            int temp = nums[i];
            nums[i]= nums[0];
            nums[0]=temp;

            heapsize -=1;
            heapify(nums,0,heapsize);

        }

    }

    void buildheap(int nums[],int heapsize)
    {
        for(int i = (heapsize/2)-1;i>=0;i--)
        {
            heapify(nums,i,heapsize);
        }
    }

    void heapify(int nums[], int index , int size)
    {

        int left = 2*index+1;
        int right = 2*index+2;
        int largest = index ;

        if(left < size && nums[left]>nums[index])
        {
            largest=left;
        }

        if(right < size&&nums[right]>nums[largest])
        {
            largest =right;
        }

        if(largest!=index)
        {
            int temp = nums[largest];
            nums[largest]=nums[index];
            nums[index]=temp;
            heapify(nums,largest,size);
        }


    }


}