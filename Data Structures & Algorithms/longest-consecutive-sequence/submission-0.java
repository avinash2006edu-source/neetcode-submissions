class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            if(set.contains(num-1)){
                continue;
            }
            int currentlen=0;
            while(set.contains(num)){
                currentlen++;
                num++;
            }
            max=Math.max(max,currentlen);
        }
        return max;

    }
}
