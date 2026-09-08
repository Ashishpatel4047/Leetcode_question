class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = nums.length-1;

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum>target){
                j--;
            }else if(sum<target){
                i++;
            }else{
                return new int[]{
                    i=i+1,
                    j=j+1
                };
            }
        }
        return new int[]{
            -1,-1
        };
        
    }
}