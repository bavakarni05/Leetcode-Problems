class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr=new int[10];
        int n1=n;
        while(n1>0){
            int rem=n1%10;
            arr[rem]=arr[rem]+1;
            n1=n1/10;
        }
        int score=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)
              score=score+(arr[i]*i);
        }
        return score;
    }
}