class Solution {
    public boolean areNumbersAscending(String s) {
        // Split the sentence into tokens by spaces
    String[] tokens = s.split(" ");
    int previousNumber = -1;

    // Iterate through each token in the sentence
    for (String token : tokens) {
        // Check if the token is a number
        if (Character.isDigit(token.charAt(0))) {
            int currentNumber = Integer.parseInt(token);

            // Check if the current number is greater than the previous number
            if (currentNumber <= previousNumber) {
                return false;
            }

            // Update the previous number to the current number
            previousNumber = currentNumber;
        }
    }

    return true;
    }
}