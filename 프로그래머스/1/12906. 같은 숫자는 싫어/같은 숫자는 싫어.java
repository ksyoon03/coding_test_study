import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0; i < arr.length; i++){
            if(deque.isEmpty() || deque.getLast() != arr[i]){
                deque.addLast(arr[i]);
            }
        }
        int[] answer = new int[deque.size()];
        int index = 0;
        while(!deque.isEmpty()) {
            answer[index++] = deque.pollFirst();
        }

        return answer;
    }
}
