class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> t1=new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
            t1.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(t1.containsKey(nums2[i][0])){
              int k = t1.get(nums2[i][0]);

                t1.put(nums2[i][0],k+nums2[i][1]);
            }
            else{
                t1.put(nums2[i][0],nums2[i][1]);
            }
        }
         int[][] res = new int[t1.size()][2];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : t1.entrySet()) {
            res[index][0] = entry.getKey();
            res[index][1] = entry.getValue();
            index++;
        }
        return  res;
    }
}