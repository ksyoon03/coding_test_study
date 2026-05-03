import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++){
            q.add((int)Math.ceil(100.0 - progresses[i]) / speeds[i]);
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int value = q.poll();
            int cnt = 1;
            while(!q.isEmpty() && value >= q.peek()){
                cnt++;
                q.poll();
            }
            list.add(cnt);
        }

        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
