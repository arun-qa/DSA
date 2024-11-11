class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        

        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                sb = sb.append(s.charAt(i));
            }
        }

        for(int j=sb.length()-1; j>=0; j--)
        {
            sb1 = sb1.append(sb.charAt(j));
        }
        if(sb.toString().equals(sb1.toString()))
        {
            return true;
        }
        return false;
    }
}