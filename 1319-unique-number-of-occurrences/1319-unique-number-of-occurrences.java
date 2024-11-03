class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> h1=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        h1.put(arr[i],h1.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> s1=new HashSet<>(h1.values());
        return h1.size()==s1.size();
    }
}