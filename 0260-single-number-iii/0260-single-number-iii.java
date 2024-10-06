class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            h1.put(nums[i],h1.getOrDefault(nums[i],0)+1);
        }
       List<Integer> l1=new ArrayList<>();
       for(int key:h1.keySet()){
        if(h1.get(key)==1){
            l1.add(key);
        }
       }
    int arr[]=new int[l1.size()];
    for(int i=0;i<l1.size();i++){
        arr[i]=l1.get(i);
    }
    return arr;
        
    }
}