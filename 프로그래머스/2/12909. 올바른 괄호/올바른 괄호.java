import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<String> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(0) == ')'){
                return false;
            }
            if(s.charAt(i) == '('){
                stack.push("(");
            }
            if(!stack.isEmpty() && s.charAt(i) == ')'){
                stack.pop();
            }
        }

        boolean answer = true;
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}