class Solution {
    public boolean check(int[] nums) {
        int m=nums.length;
        int count=0;
        boolean sorted=true;
        for(int i=0;i<m;i++)
        {
            if(nums[i]>nums[(i+1)%m])
            {
                count++;
            }
            

        }
        if(count>1)
        {
            return false;
        }
        return true;
    }
}