class Solution {
    public boolean isPalindrome(int x) {
        int x1=x;
        int res=0;
        while(x1>0){
            int rem=x1%10;
            res=res*10+rem;
            x1=x1/10;
            
        }
        if(x==res){
            return true;
        }
        return false;
    }
}