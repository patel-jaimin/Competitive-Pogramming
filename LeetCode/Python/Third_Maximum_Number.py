# 414. Third Maximum Number

# Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

# Example 1:
# Input: [3, 2, 1]

# Output: 1

# Explanation: The third maximum is 1.
# Example 2:
# Input: [1, 2]

# Output: 2

# Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
# Example 3:
# Input: [2, 2, 3, 1]

# Output: 1

class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        Max , Second_Max , Third_Max = -math.inf,-math.inf,-math.inf  
        for value in nums :
            if value > Max :
                Third_Max = Second_Max
                Second_Max = Max
                Max = value
            elif value > Second_Max and value != Max :
                Third_Max = Second_Max
                Second_Max = value
            elif value > Third_Max and value != Max and value != Second_Max:
                Third_Max = value
        if Third_Max == -math.inf:
            return Max
        else:
            return Third_Max
                
                
        