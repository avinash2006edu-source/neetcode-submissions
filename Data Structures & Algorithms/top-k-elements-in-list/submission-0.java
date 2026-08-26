class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int maxelement=0;

            for(int num:map.keySet()){
                if(map.get(num)>maxfreq){
                    maxfreq=map.get(num);
                    maxelement=num;
                }
            }

                result[i]=maxelement;

                map.remove(maxelement);

            
        }
        return result;
    }
}