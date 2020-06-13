# 709. To Lower Case
# Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

 

# Example 1:

# Input: "Hello"
# Output: "hello"
# Example 2:

# Input: "here"
# Output: "here"
# Example 3:

# Input: "LOVELY"
# Output: "lovely"


class Solution:
    def toLowerCase(self, str: str) -> str:
        result=''
        for value in str:
            if ord(value)>=65 and ord(value)<=90:
                result+=chr(ord(value)+32)
            else:
                result+=value
        return result
        