
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
