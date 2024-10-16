class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int ransomNotefrequency[] = new int[26];
        int magazinefrequency[] = new int[26];

        for(int i=0; i<ransomNote.length();i++)
        {
            ransomNotefrequency[ransomNote.charAt(i)-'a']++;
           
        }

        for(int i=0; i<magazine.length();i++)
        {
            
            magazinefrequency[magazine.charAt(i)-'a']++;
        }

        for(int j=0; j<26; j++)
        {
            if(ransomNotefrequency[j]>magazinefrequency[j])
            {
                return false;
                
            }
        }
                return true;
       
    }
}