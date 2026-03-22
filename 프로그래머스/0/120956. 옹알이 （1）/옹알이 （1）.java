class Solution {
    public int solution(String[] babbling) {
        String[]tmp = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for(String b : babbling){
            for(String t : tmp){
                b = b.replace(t, " ");
            }
            b = b.replace(" ", "");
            if(b.equals(""))
                answer++;
        }
        return answer;
    }
}