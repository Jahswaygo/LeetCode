/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start

import java.util.Stack;

class Solution 
{
    public boolean isPalindrome(String s) 
    {
        boolean isValid = false;
        StringBuilder forwardString= new StringBuilder();
        Stack<Character> stackofCharacters=new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        //Iterating through the given string saving the alphanumeric values.
        for (char c: s.toCharArray())
        {
            if(Character.isLetterOrDigit(c))
            {
                forwardString.append(c);
            }else
            {
                continue;
            }
        }

        //Pushing string to stack
        for (char c : forwardString.toString().toCharArray())
        {
            stackofCharacters.push(c);
        }
        
        //Popping stack to reverse order
        while (!stackofCharacters.isEmpty())
        {
            reversedString.append(stackofCharacters.pop());   
        }
        //Return True if they are a valid palindrome
        if (forwardString.toString().equalsIgnoreCase(reversedString.toString()))
        {
            isValid = true;
        }else
        {
            isValid = false;
        }
        
        return isValid;
    }
}
// @lc code=end

