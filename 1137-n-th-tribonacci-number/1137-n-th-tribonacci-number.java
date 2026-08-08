class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;

        }else if(n==1){
            return 1;
        }
        int first = 0;
        int second = 1;
        int third = 1;
        for(int i =1;i<=n;i++){
            int forth = first + second + third;
            first = second;
            second = third;
            third = forth;
        } return first;
    }
}