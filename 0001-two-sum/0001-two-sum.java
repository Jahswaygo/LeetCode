
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
