class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)        {
            h1.put(nums1[i],h1.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(h1.containsKey(nums2[i])&&h1.get(nums2[i])>0){
              result.add(nums2[i]);
             h1.put(nums2[i],h1.get(nums2[i])-1);

            }
        }
        int[] arr=new int[result.size()];
        for(int i=0;i<result.size();i++){
            arr[i]=result.get(i);
        }
        return arr;
    }
}