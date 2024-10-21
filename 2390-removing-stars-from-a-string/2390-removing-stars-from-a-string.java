class Solution {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length();i++)
        {
            sb = sb.append(s.charAt(i));

            if(sb.length()>1 && sb.charAt(sb.length()-1)=='*')
            {
                sb.deleteCharAt(sb.length()-1);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
        
        
    }
}