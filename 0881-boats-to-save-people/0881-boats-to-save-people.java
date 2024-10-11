class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
    Arrays.sort(people);

    int i=people.length-1;
    int j=i-1;
    int count = 0;

    while(j>=0 && j!=i)
    {
        if(i==limit)
        {
            count++;
            j--;
            i--;    
        }
       

        else if(people[i]+people[j]>limit)
        {
            count++;  
            j--;
            i--;  
        }

        else if(people[i]+people[j] == limit)
        {
            count++;
            j=j-2;
            i=i-2;
        }
       
    }
            return count;
    }
}