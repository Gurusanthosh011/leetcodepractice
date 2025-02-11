class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int partLength = part.length();
        int i = 0;

        while (sb.length() != 0 && i <= sb.length() - partLength) {
            if (sb.substring(i, i + partLength).equals(part)) {
                sb.delete(i, i + partLength);
                i = Math.max(0, i - partLength);
            } else {
                i++;
            }
        }
        
        return sb.toString();
}
}