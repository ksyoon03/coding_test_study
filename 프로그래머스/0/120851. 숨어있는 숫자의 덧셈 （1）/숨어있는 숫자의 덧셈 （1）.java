class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("[^0-9]", "");
        for(String m : my_string.split("")){
            answer += Integer.parseInt(m);
        }
        return answer;
    }
}