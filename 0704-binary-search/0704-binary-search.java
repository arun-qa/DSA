class Solution {
    public int search(int[] nums, int target) {

        int i=0;
        int j=nums.length-1;

        if(nums.length==1 && nums[0]==target)
        {
            return 0;
        }
        

        while(i<j)
        {
            if(nums[i]==target)
            {
                return i;
            }
            else if(nums[j]==target)
            {
                return j;
            }

            i++;
            j--;
        }

        return -1;
    }
}