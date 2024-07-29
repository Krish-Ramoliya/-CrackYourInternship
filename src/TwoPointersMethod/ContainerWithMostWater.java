package TwoPointersMethod;
import java.util.*;

public class ContainerWithMostWater {

    public static void main(String[] args){

        int []nums = {1,8,6,2,5,4,8,3,7};
        Area ob = new Area();
        int MaxAmountwater = ob.maxArea(nums);
        System.out.println(MaxAmountwater);

    }
}
class Area {
    public int maxArea(int[] nums) {

        List<Integer> numbers = new ArrayList<>();
        int left = 0;
        int right = nums.length-1;
        int max=0;

        while(left<right)
        {
            if(nums[left]<nums[right])
            {
                numbers.add((right-left)*(nums[left]));
                left++;
            }
            else if(nums[left]>nums[right])
            {
                numbers.add((right-left)*(nums[right]));
                right--;
            }
            else{
                numbers.add((right-left)*(nums[left]));
                left++;
            }
        }

        max = Collections.max(numbers);

        return max;

    }
}
