class Solution {
    public int[] separateDigits(int[] nums) {
         List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            String strNum = String.valueOf(num);
            for (char digit : strNum.toCharArray()) {
                result.add(digit - '0');
            }
        }
        
        // Convert the result list back to an array
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}