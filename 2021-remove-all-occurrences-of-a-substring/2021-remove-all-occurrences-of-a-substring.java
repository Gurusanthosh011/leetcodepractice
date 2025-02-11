class Solution {
    public String removeOccurrences(String s, String part) {
        int n=part.length();
        StringBuilder s1=new StringBuilder(s);
        while(true){
            int id=s1.indexOf(part);
            if(id==-1){
                break;
            }
            s1.delete(id,id+n);
        }
        return s1.toString();
    }
}