import java.util.*;

class Solution {
    public int[] solution(int n) {

        Queue<Integer> q = new LinkedList<>();
        for(int i=1; i<=n; i++){
            if(i%2==1){
                q.add(i);
            }
        }
        int[] answer = new int[q.size()];
        for(int i=0;i<answer.length;i++){
            answer[i]=q.poll();
        }
        return answer;
    }
}