/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 *
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (66.83%)
 * Likes:    16590
 * Dislikes: 474
 * Total Accepted:    2.1M
 * Total Submissions: 3.2M
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * Given an array of strings strs, group the anagrams together. You can return
 * the answer in any order.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= strs.length <= 10^4
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 * 
 * 
 */

// @lc code=start

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

class Solution 
{
    private String sortString(String str) 
    {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        
        return new String(chars);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        List<List<String>> allGroupedAnagrams = new ArrayList<>();
        HashMap<String, ArrayList<String>> pairs = new HashMap<>();
        
        // Iterate through the array of strings
        for (String str : strs) 
        {
            // Create a sorted version of the string
            String sortedStr = sortString(str);

            // Check if the sorted string is a key in the hashmap
            if (pairs.containsKey(sortedStr)) 
            {
                pairs.get(sortedStr).add(str); // Add to the existing group
            } else 
            {
                ArrayList<String> newGroup = new ArrayList<>();
                newGroup.add(str); // Create a new group
                pairs.put(sortedStr, newGroup);
            }
        }
        
        // Construct the final result
        for (ArrayList<String> group : pairs.values()) 
        {
            allGroupedAnagrams.add(group);
        }
        
        return allGroupedAnagrams;
    }
}

// @lc code=end

