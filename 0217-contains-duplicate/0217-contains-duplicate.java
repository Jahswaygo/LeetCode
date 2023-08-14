/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (61.12%)
 * Likes:    10252
 * Dislikes: 1204
 * Total Accepted:    3.1M
 * Total Submissions: 5M
 * Testcase Example:  '[1,2,3,1]'
 *
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 * 
 * 
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 * Example 3:
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 
 * 
 */

// @lc code=start

import java.util.Arrays;

class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Arrays.sort(nums);
        for (int i=1; i< nums.length; i++)
        {
            if (nums[i]==nums[i-1])
            {
                return true;
            }
        }      
        return false;
    }
}
// @lc code=end
