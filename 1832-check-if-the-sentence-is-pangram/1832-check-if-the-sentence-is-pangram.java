class Solution {
    public boolean checkIfPangram(String sentence) {

        int[] frequency = new int[26];

        for(int i=0; i<sentence.length(); i++)
        {
            frequency[sentence.charAt(i)-'a']++;
        }

            for(int i=0; i<frequency.length; i++) 
            {
                if(frequency[i]==0)
                {
                    return false;
                }
            } 

            return true;      
    }
}