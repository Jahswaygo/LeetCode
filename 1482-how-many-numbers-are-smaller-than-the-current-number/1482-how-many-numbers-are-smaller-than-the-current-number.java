class Solution 
{
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int length = nums.length;
        int [] SmallerThan= new int [length];

        for (int i=0;i<length;i++)
        {
            int counter=0;
            for (int j=0;j<length; j++)
            {
                if(nums[i]>nums[j])
                {
                    counter++;
                }
            }
            SmallerThan[i]=counter;
        }
        return SmallerThan;
    }
}