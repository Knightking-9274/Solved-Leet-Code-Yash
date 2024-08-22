class Solution {
    public int findComplement(int num) {
         // Find the number of bits in the binary representation of num
        int bitLength = Integer.toBinaryString(num).length();
        
        // Create a mask with all bits set to 1 and the same length as num
        int mask = (1 << bitLength) - 1;
        
        // XOR num with mask to flip all the bits
        return num ^ mask;
    }
}