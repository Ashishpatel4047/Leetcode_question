class Solution {
    public boolean numberHasEvenDigit(int num){
        int digitCount = 0;
        while(num!=0){
            num= num/10;
            digitCount++;
        }
        return digitCount%2==0;
    }
    public int findNumbers(int[] nums) {
        int EvenCount = 0;
        for(int i=0;i<nums.length;i++){
            if(numberHasEvenDigit(nums[i])){
                EvenCount++;
            }
            
        }
        return EvenCount;
        
    }
}

 

