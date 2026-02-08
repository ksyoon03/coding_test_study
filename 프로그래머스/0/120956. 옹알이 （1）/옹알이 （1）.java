import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] tmp = {"aya", "ye", "woo", "ma"};
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<tmp.length; j++){
                babbling[i] = babbling[i].replace(tmp[j], " ");
            }
        }
        for(int i = 0; i<babbling.length; i++){
            if(babbling[i].trim().equals("")){
                answer++;
            }
        }
        return answer;
    }
}