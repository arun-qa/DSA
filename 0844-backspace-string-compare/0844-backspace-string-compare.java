class Solution {
    public boolean backspaceCompare(String s, String t) {

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

         

        for(int i=0; i<s.length();i++)
        {
            if(s.charAt(i)!= '#')
            {
                    sb = sb.append(s.charAt(i));
            }

            else if(sb.length()>0)
            {
                sb.deleteCharAt(sb.length()-1);
                
            }
        }

        for(int i=0; i<t.length();i++)
        {
            if(t.charAt(i)!= '#')
            {
                    sb1 = sb1.append(t.charAt(i));
            }

            else if(sb1.length()>0)
            {
                sb1.deleteCharAt(sb1.length()-1);
                
            }
        }
        return sb.toString().equals(sb1.toString());
        

       
        
    }
}