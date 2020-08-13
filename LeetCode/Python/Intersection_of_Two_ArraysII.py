# 350. Intersection of Two Arrays II
# Given two arrays, write a function to compute their intersection.

# Example 1:

# Input: nums1 = [1,2,2,1], nums2 = [2,2]
# Output: [2,2]
# Example 2:

# Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
# Output: [4,9]

class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        copy = {}
        result=[]
        for values in nums1:
            if values not in copy:
                copy[values]=1
            else:
                copy[values]+=1
        for values in nums2:
            if values in copy and copy[values]>0:
                copy[values]-=1
                result.append(values)
        return result