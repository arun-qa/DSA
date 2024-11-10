class Solution {
    public void reverseString(char[] s) {

        //pseudocode
        //Get an input as Char[]
        // intiatiate two variables left and right
        // Iterate while loop till length of s
        // Create one temp varaiable and assign the left character
        // Assign the right character to left char
        // Assign the temp to right

        int left=0;
        int right = s.length - 1;

        while(left<=right)
        {
            char temp = s[left];
            s[left] = s[right];
            left++;
            s[right] = temp;
            right--;
        }
        
    }
}