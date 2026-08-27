class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        numbers = set(nums)
        longest = 0

        for number in numbers:
            # Start only at the beginning of a sequence.
            if number - 1 not in numbers:
                current = number
                length = 1

                while current + 1 in numbers:
                    current += 1
                    length += 1

                longest = max(longest, length)

        return longest
