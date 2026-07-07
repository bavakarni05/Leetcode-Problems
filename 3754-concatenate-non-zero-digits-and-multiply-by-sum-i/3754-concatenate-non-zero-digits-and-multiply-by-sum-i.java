class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        long n1=n;
        while(n1>0){
            long rem=n1%10;
            if(rem>0){
            sum=sum+rem;
            x=x*10+rem;
            }
             n1=n1/10;
        }
        n1=x;
        long x1=0;
        while(n1>0){
            long rem=n1%10;
            x1=x1*10+rem;
            n1=n1/10;
        }
        return sum*x1;
    }
}