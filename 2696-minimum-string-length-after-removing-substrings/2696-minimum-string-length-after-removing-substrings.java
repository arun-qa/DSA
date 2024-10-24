class Solution {
    public int minLength(String s) {

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++)
        {
            sb = sb.append(s.charAt(i));

            if (sb.length() > 1) {
                String lastTwo = sb.substring(sb.length() - 2);
               
                if (lastTwo.equals("AB") || lastTwo.equals("CD")) {
                    
                    sb.delete(sb.length() - 2, sb.length());
                }
            }
                  
        
    }

    return sb.length();
}
}