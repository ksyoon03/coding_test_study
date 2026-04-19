import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int t = bandage[0];
        int x = bandage[1];
        int y = bandage[2];
        int success = 0; // 연속 성공 횟수

        Map <Integer, Integer> map = new HashMap<>();
        for(int[] attack : attacks){
            map.put(attack[0], attack[1]);
        }

        for(int i = 1; i <= attacks[attacks.length - 1][0]; i++){
            if(map.getOrDefault(i, 0) > 0){ // 공격 받았을 경우
                answer -= map.getOrDefault(i, 0);
                success = 0;
                if(answer <= 0) return -1;
            } else {
                answer += x;
                success++;
                if(t == success) {
                    answer += y;
                    success = 0;
                }
                answer = Math.min(answer, health);
            }
        }

        return answer;
    }
}