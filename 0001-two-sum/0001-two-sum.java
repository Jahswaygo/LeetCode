/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 *
 * https://leetcode.com/problems/two-sum/description/
 *
 * algorithms
 * Easy (50.40%)
 * Likes:    49928
 * Dislikes: 1613
 * Total Accepted:    10.4M
 * Total Submissions: 20.7M
 * Testcase Example:  '[2,7,11,15]\n9'
 *
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 * 
 * 
 * 
 * Follow-up: Can you come up with an algorithm that is less than O(n^2) time
 * complexity?
 */

// @lc code=start

import java.util.Arrays;

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int n = nums.length;

        // Step 1: Efficiently find pairs of indices with a target sum
        Integer[] sortedIndices = new Integer[n];
        for (int i = 0; i < n; i++) {
            sortedIndices[i] = i;
        }

        // Sort sortedIndices array based on corresponding values in nums
        Arrays.sort(sortedIndices, (a, b) -> Integer.compare(nums[a], nums[b]));

        int left = 0;
        int right = n - 1;

        // Use two-pointer approach on sortedIndices array
        while (left < right) 
        {
            int sum = nums[sortedIndices[left]] + nums[sortedIndices[right]];
            if (sum == target) 
            {
                // We found a pair with the target sum, return the indices
                return new int[] { sortedIndices[left], sortedIndices[right] };
            } else if (sum < target)
            {
                left++; // Move the left pointer to increase the sum
            } else
            {
                right--; // Move the right pointer to decrease the sum
            }
        }

        // If no solution found, return an array indicating no solution
        return new int[] { -1, -1 };
    }
}
// @lc code=end