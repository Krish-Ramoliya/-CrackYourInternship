package Sorting;

import java.util.Arrays;

public class Qsort {

    public static void main(String args[])
    {
        int nums[]={8,36,7,2,1};
        quicksort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums)); // quick sort
    }

    private static void quicksort(int[] nums, int start, int end) {

        if(start<end)
        {
            int q = partition(nums,start,end);
            quicksort(nums,start,q-1);
            quicksort(nums,q+1,end);

        }

    }

    private static int partition(int[] nums, int start, int end) {

        int pivot = nums[end];
        int shadow = start - 1;

        for(int iter = start ; iter  < end ;iter++)
        {
            if(nums[iter]<pivot)
            {
                shadow++;
                swap(nums,shadow,iter);
            }
        }

        swap(nums,shadow+1,end);
        return shadow+1;
    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
