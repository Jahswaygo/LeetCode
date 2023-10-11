/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start

import java.util.HashMap;

class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        // Create a HashMap to store numbers and their indices.
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        //Load values into the Map
        int index=0;
        for (int i = 0; i < numbers.length; i++) 
        {
            index++;
            numMap.put(numbers[i], index);
        }

        //Check the map for complements
        for (int i = 0; i < numbers.length; i++) 
        {
            int complement = target - numbers[i];
            
            // Check if the complement exists in the HashMap.
            if (numMap.containsKey(complement)) 
            {
                // Return the indices of the two numbers.
                return new int[] {i + 1, numMap.get(complement)};
            }
        }
        // If no solution is found, return an empty array.
        return new int[0];
    }
}
// @lc code=end

