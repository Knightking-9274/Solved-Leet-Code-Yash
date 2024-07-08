class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        // Pointers to traverse the strings from the end
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;

        // Traverse both strings
        while (p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;

            // Calculate sum of digits and carry
            int sum = x1 + x2 + carry;
            carry = sum / 10;
            sum = sum % 10;

            // Append current digit to result
            result.append(sum);

            // Move pointers to the left
            p1--;
            p2--;
        }

        // If there's a remaining carry, append it
        if (carry > 0) {
            result.append(carry);
        }

        // The result is in reverse order, so reverse it back
        return result.reverse().toString();
    }
}