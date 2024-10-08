class Solution {
    public int firstUniqChar(String s) {

        int[] frequency = new int[26];

        for(int i=0; i<s.length();i++)
        {
            frequency[s.charAt(i)-'a']++;
        }

        for(int j=0; j<s.length(); j++)
        {
            if(frequency[s.charAt(j)-'a']==1)
            {
                return j;
            }
        }
        return -1;
    }
}