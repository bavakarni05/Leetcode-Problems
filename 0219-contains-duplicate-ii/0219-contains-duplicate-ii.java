class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
               int res=Math.abs(hm.get(nums[i])-i);
               if(res<=k){
                return true;
               }
               else{
                hm.put(nums[i],i);
               }
            }
        }
        return false;
    }
}