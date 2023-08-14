/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 *
 * https://leetcode.com/problems/valid-anagram/description/
 *
 * algorithms
 * Easy (63.17%)
 * Likes:    10090
 * Dislikes: 321
 * Total Accepted:    2.5M
 * Total Submissions: 3.9M
 * Testcase Example:  '"anagram"\n"nagaram"'
 *
 * Given two strings s and t, return true if t is an anagram of s, and false
 * otherwise.
 * 
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once.
 * 
 * 
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= s.length, t.length <= 5 * 10^4
 * s and t consist of lowercase English letters.
 * 
 * 
 * 
 * Follow up: What if the inputs contain Unicode characters? How would you
 * adapt your solution to such a case?
 * 
 */

// @lc code=start

import java.util.Stack;

class Solution 
{
    public Stack<Character> StringtoStack (String s)
    {
        Stack<Character> stack=new Stack<>();

        for (char c : s.toCharArray())
        {
            stack.push(c);
        }              
        return stack;
    }

    public boolean isAnagram(String s, String t) 
    {
        Stack<Character> stackofCharacters1=new Stack<>();
        Stack<Character> stackofCharacters2=new Stack<>();
        Stack<Character> newStackofCharacters=new Stack<>();       
        int sameLetters=0;
        int stringLength;
        
        if(s.length()!=t.length())
        {
            return false;
        }

        stackofCharacters1=StringtoStack(s);
        stackofCharacters2=StringtoStack(t);
        stringLength=s.length();
        
        while (!stackofCharacters1.isEmpty()) 
        {
            char poppedChar1 = stackofCharacters1.pop();
            
            while (!stackofCharacters2.isEmpty())
            {
                char poppedChar2 = stackofCharacters2.pop();

                if (poppedChar1==poppedChar2)
                {
                    sameLetters++;
                    break;
                }else
                {
                    newStackofCharacters.push(poppedChar2);
                }
            }
            
            while (!newStackofCharacters.isEmpty())
            {
                stackofCharacters2.push(newStackofCharacters.pop());
            }
        }

        if(stringLength!=sameLetters)
        {
            return false;
        }else 
        {
            return true;
        }
    }     
}
// @lc code=end