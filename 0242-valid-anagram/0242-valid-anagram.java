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