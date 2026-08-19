class Solution {
    public void duplicateZeros(int[] arr) {
        // approach 1
        int possibleZeroDups = 0;
        int lastindex = arr.length - 1;
        for( int i =0; i<=lastindex-possibleZeroDups; i++){
            if(arr[i]==0){
                if(i==lastindex-possibleZeroDups){
                    arr[lastindex]=0;
                    lastindex--;
                    break;
                }
                possibleZeroDups++;
            
            }
        }
        int newLastindex = lastindex - possibleZeroDups;
        for(int i = newLastindex;i>=0;i--){
            if(arr[i]==0){
                arr[i+possibleZeroDups]=0;
                possibleZeroDups--;
                arr[i+possibleZeroDups]=0;

            }else{
                arr[i+possibleZeroDups]=arr[i];
            }
        }
        
    }
}