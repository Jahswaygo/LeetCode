/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer>> tripleLists= new ArrayList<>();

        //Sort Array
        Arrays.sort(nums);
        
        // Iterate through the array.
        for (int i = 0; i < nums.length - 2; i++) 
        {
            // Skip duplicates.
            if (i > 0 && nums[i] == nums[i - 1]) 
            {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];

            while (left < right)
            {
                int sum = nums[left] + nums[right];

                if (sum == target) 
                {
                    // Found a triplet that sums to zero.
                    tripleLists.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates.
                    while (left < right && nums[left] == nums[left + 1]) 
                    {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) 
                    {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < target) 
                {
                    left++;
                } else 
                {
                    right--;
                }
            }
        }

        return tripleLists;
    

    };    
    
}
// @lc code=end

