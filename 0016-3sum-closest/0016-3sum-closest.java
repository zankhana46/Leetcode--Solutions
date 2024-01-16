class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=Integer.MAX_VALUE;
        for(int i=0; i<nums.length;i++ )
        {
            for(int j=i+1 ;j<nums.length;j++)
            {
                for (int k=j+1; k<nums.length;k++)
                {
                    if (Math.abs(target - sum) > 
                        Math.abs(target - (nums[i] + nums[j] + nums[k]))) 
                    sum = (nums[i] + nums[j] + nums[k]); 
                }
            }
        }
        return sum;
    }
}