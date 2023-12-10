class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        
        if(!(str1+str2).equals(str2 +str1))
            return "";
        
        int res = gcd(l1,l2);
        return str1.substring(0,res);
    }
    public int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}