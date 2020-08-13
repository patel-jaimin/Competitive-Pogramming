# 75. Sort Colors
# Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

# Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

# Note: You are not suppose to use the library's sort function for this problem.

# Example:

# Input: [2,0,2,1,1,0]
# Output: [0,0,1,1,2,2]

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        Head_pointer = 0
        Tail_pointer = len(nums)-1
        index = 0
        while index <= Tail_pointer:
            if nums[index] == 0 :
                nums[index] , nums[Head_pointer] = nums[Head_pointer] , nums[index]
                Head_pointer+=1
                index+=1
            elif nums[index] == 2 :
                nums[index] , nums[Tail_pointer] = nums[Tail_pointer] , nums[index]
                Tail_pointer-=1
            else:
                index+=1