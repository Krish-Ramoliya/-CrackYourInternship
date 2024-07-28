package TwoPointersMethod;
import java.util.*;
import java.util.ArrayList;

public class ThreeIngeterSum {

    public static void main(String []args)
    {
        int[] nums = {-3,-3,4,-3,1,2};
        ThreesumSolutoin ob  = new ThreesumSolutoin();
        List<List<Integer>> res = new ArrayList<>();
        res = ob.threeSum(nums);
        System.out.println(res);

    }
}

class ThreesumSolutoin {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return res;
    }
}

