class Solution {
    public boolean isAnagram(String s, String t) {

        int[] frequency = new int[26];

        for(int i=0; i<s.length(); i++)
        {
            frequency[s.charAt(i)-'a']++;
           // frequency[t.charAt(i)-'a']--;

        }
        for(int i=0; i<t.length(); i++)
        {
           // frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;

        }

        for(int i=0; i<frequency.length; i++)
        {
            if(frequency[i]!=0)
            {
                return false;
            }
        }

        return true;
        
    }
}