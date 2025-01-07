class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> s1=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String m=words[i];
            for(int j=0;j<words.length;j++){
                String n=words[j];
                if(i!=j&&n.contains(m)){
                    s1.add(m);
                    break;
                }

            }
        }
        return s1;
    }
}