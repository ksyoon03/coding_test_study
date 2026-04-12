import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        char[] types = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(char t : types){
            map.put(t, 0);
        }

        for(int i=0; i<survey.length;i++){
            char first = survey[i].charAt(0);
            char second = survey[i].charAt(1);

            if(choices[i]==1){
                map.put(first, map.get(first) + 3);
            } else if(choices[i]==2){
                map.put(first, map.get(first) + 2);
            } else if (choices[i]==3){
                map.put(first, map.get(first) + 1);
            } else if (choices[i]==5){
                map.put(second, map.get(second) + 1);
            } else if (choices[i]==6){
                map.put(second, map.get(second) + 2);
            } else if (choices[i]==7){
                map.put(second, map.get(second) + 3);
            }
        }

        String answer = "";
        answer += (map.get('R') >= map.get('T')) ? 'R' : 'T';
        answer += (map.get('C') >= map.get('F')) ? 'C' : 'F';
        answer += (map.get('J') >= map.get('M')) ? 'J' : 'M';
        answer += (map.get('A') >= map.get('N')) ? 'A' : 'N';

        return answer;
    }
}