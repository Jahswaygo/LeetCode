/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int length = nums.length;
        int[] result = new int[length];

        // Calculate the left products of each element
        int leftProduct = 1;
        for (int i = 0; i < length; i++) 
        {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the right products of each element and multiply with left products
        int rightProduct = 1;
        for (int i = length - 1; i >= 0; i--) 
        {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }
}

// @lc code=end
