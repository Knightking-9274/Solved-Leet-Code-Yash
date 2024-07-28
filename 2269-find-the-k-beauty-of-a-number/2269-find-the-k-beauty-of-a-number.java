class Solution {
    public int divisorSubstrings(int num, int k) {
        String temp = String.valueOf(num);
        int kBeauty = 0;
        
        for(int i=0; i<=temp.length()-k; i++){
            int divisor = Integer.parseInt(temp.substring(i,i+k));
            
            if(divisor!=0 && num%divisor==0){
                kBeauty++;
            }
            
        }
        return kBeauty;
    }
}