# 560. Subarray Sum Equals K
# Given an array of integers and an integer k, you need to find the 
# total number of continuous subarrays whose sum equals to k.

# Example 1:

# Input:nums = [1,1,1], k = 2
# Output: 2
# Constraints:

# The length of the array is in range [1, 20,000].
# The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        subArrayCount={0:1}
        cummulativeSum = 0
        count = 0 
        
        for value in nums :
            cummulativeSum+=value
            if (cummulativeSum - k) in subArrayCount:
                count += subArrayCount[cummulativeSum - k]
            if cummulativeSum in subArrayCount:
                subArrayCount[cummulativeSum] += 1
            else :
                subArrayCount[cummulativeSum] = 1
        return count
        
        
        