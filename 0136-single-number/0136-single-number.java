class Solution {
    public int singleNumber(int[] nums) {
        int num2=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        
        for (int num : map.keySet()) {
            if (map.get(num)==1) {
                num2= num;  
            }
        }
        return num2;
       
    }
}
