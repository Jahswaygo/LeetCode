/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 *
 * https://leetcode.com/problems/top-k-frequent-elements/description/
 *
 * algorithms
 * Medium (63.42%)
 * Likes:    15636
 * Dislikes: 549
 * Total Accepted:    1.6M
 * Total Submissions: 2.6M
 * Testcase Example:  '[1,1,1,2,2,3]\n2'
 *
 * Given an integer array nums and an integer k, return the k most frequent
 * elements. You may return the answer in any order.
 * 
 * 
 * Example 1:
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 * Input: nums = [1], k = 1
 * Output: [1]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 * 
 * 
 * 
 * Follow up: Your algorithm's time complexity must be better than O(n log n),
 * where n is the array's size.
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int [] mostFreq= new int[k];
        HashMap<Integer, Integer> valuesMap = new HashMap<>();
        
        for (int i : nums)
        {
            if (valuesMap.containsKey(i))
            {
                valuesMap.put(i, valuesMap.get(i)+1);
            }else
            {
                valuesMap.put(i, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> valuesList = new ArrayList<>(valuesMap.entrySet());
        
        // Sort the entryList based on values (frequency counts) in descending order
        Collections.sort(valuesList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        
        // Extract the keys from the sorted entries
        for (int i = 0; i < k; i++) 
        {
            mostFreq[i] = valuesList.get(i).getKey();
        }
        
        return mostFreq;
    }
}
// @lc code=end

