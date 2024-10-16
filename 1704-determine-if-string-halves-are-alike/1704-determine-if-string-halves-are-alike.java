class Solution {
    public boolean halvesAreAlike(String s) {

        s= s.toLowerCase();

        int mid = s.length()/2;

        String vowels = "aeiou";

        String a = s.substring(0,mid);
        String b = s.substring(mid);
        int count = 0;
        int count1 = 0;

        for(int i=0; i<a.length(); i++)
        {
            if(vowels.indexOf(a.charAt(i))!=-1)
            {
                count++;
            }

            if(vowels.indexOf(b.charAt(i))!=-1)
            {
                count1++;
            }
        }

       return count == count1;
        
    }
}