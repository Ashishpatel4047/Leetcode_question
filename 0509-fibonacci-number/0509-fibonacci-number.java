class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int fact =0;
        int count = 1;
        for(int i=1; i<=n;i++){
            int num = fact+count;
            fact = count;
            count = num;
        }
        return fact;
    }
}