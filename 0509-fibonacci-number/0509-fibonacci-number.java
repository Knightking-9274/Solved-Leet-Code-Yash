class Solution {
    public int fib(int n) {
        int num1 = 0, num2 = 1, cnt=1, sum=0;
        if(n==0) return num1;
        if(n==1) return num2;
        
        
        while(cnt!=n){
            sum = num1+num2;
            num1=num2;
            num2 = sum;
            cnt++;
        }
        return sum;
    }
}