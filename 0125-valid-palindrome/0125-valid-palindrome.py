class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        newstr = ""
        for ch in s:
            if(ch.isalnum()):
                newstr += ch.lower()
        
        return(newstr == newstr[::-1])
        
        