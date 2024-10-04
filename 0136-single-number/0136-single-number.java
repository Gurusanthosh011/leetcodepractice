class Solution {
    public int singleNumber(int[] nums) {
        int num2=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 2: Populate the HashMap with the frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 3: Find the number with frequency 1
        for (int num : map.keySet()) {
            if (map.get(num) %2==1) {
                num2= num;  // This is the number that appears only once
            }
        }
        return num2;
       
    }
}
