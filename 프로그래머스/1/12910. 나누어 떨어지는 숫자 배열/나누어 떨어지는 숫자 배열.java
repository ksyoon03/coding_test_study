import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                stack.push(arr[i]);
            }
        }
        
        if(stack.isEmpty()){
            stack.push(-1);
        }
        
        int[] answer = new int[stack.size()];
        for(int i=0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
