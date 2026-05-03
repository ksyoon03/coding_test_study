import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++){
            int[] lists = new int[2];
            lists[0] = i; // 처음 위치
            lists[1] = priorities[i]; // 중요도
            queue.offer(lists);
        }

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            boolean check = true;

            for(int[] q : queue){
                if(q[1] > cur[1]){
                    check = false;
                    break;
                }
            }

            if(check == false){
                queue.offer(cur);
            } else {
                answer++;
                if(cur[0] == location){
                    return answer;
                }
            }
        }

        return answer;
    }
}