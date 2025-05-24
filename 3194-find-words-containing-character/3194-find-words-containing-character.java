class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
         String target = String.valueOf(x);
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
           
            if (words[i].contains(target)) {
                l1.add(i);
            }
        }
        return l1;
        
    }
}