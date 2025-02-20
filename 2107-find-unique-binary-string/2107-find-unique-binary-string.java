class Solution {
    public String findDifferentBinaryString(String[] nums) {
           String s=nums[0];
           int n=s.length();
          HashMap<String,Integer> h1=new HashMap<>();
          int resl=1<<n;
          for(int i=0;i<resl;i++){
             StringBuilder bin = new StringBuilder();
             int temp=i;
            while(temp>0){
                int bit=temp&1;
                 bin.append(bit);
                   temp = temp>> 1;

            }
             while (bin.length() < n) {
                bin.append("0");
            }
            h1.put(bin.reverse().toString(),1);
          }
          for(String num:nums){
           h1.put(num, h1.getOrDefault(num, 0) + 1);
          }
          for(String Key:h1.keySet()){
            if(h1.get(Key)==1){
                return Key;
            }
          }
          return "";
        
    }
}