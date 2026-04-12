class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int zeroCnt = 0;

        for(int l : lottos){
            if(l == 0){
                zeroCnt++;
            }
            for(int w : win_nums){
                if(l == w){
                    cnt++;
                }
            }
        }

        answer[0] = 7 - (zeroCnt + cnt);
        answer[1] = 7 - cnt;

        if(answer[0] > 6) answer[0] = 6;
        if(answer[1] > 6) answer[1] = 6;

        return answer;
    }
}