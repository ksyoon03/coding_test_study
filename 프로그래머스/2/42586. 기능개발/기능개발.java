import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        double[] days = new double[progresses.length];
        Stack<Integer>stack = new Stack<>();

        for(int i = 0; i < progresses.length; i++){
            days[i] = Math.ceil((double)(100 - progresses[i]) / speeds[i]);
        }

        ArrayList <Integer> arr = new ArrayList<>();
        stack.push((int)days[0]);
        int cnt = 1;
        for(int i = 1; i < days.length; i++){
            if(stack.peek() >= days[i]){
                cnt++;
            } else {
                arr.add(cnt);
                stack.push((int)days[i]);
                cnt = 1;
            }
        } arr.add(cnt);

        int[]answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}