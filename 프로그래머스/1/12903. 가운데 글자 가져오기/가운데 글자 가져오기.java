class Solution {
    public String solution(String s) {
        String answer = "";
        int n = s.length() % 2;
        if(n==0){
            char c1 = s.charAt(s.length() / 2 - 1);
            char c2 = s.charAt(s.length() / 2);
            answer = String.valueOf(c1) + String.valueOf(c2);
        } else {
            char c3 = s.charAt(s.length() / 2);
            answer = String.valueOf(c3);
        }
        return answer;
    }
}
