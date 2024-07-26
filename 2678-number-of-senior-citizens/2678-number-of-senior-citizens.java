class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(int i=0; i<details.length; i++){
            String s2 = details[i].substring(11,13);
            int num = Integer.parseInt(s2);
            if(num>60){
                cnt++;
            }
        }
        return cnt;
    }
}