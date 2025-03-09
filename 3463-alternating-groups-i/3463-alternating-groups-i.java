class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count=0;
        int k=3;
        int n=colors.length;
        for(int i=0;i<colors.length;i++){
             if (colors[i] != colors[(i + 1) % n] && colors[i] == colors[(i + 2) % n]) {
                count++;
           
        }}
        return count;
        
    }
}