import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int num = sc.nextInt();
            // 1 x
            if(num == 1){
                int x = sc.nextInt();
                stack.push(x);
            }
            // 2
            if(num == 2) {
                if(stack.isEmpty()) sb.append(-1).append("\n");
                else {
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            }
            // 3
            if(num == 3) sb.append(stack.size()).append("\n");
            // 4
            if(num == 4){
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            // 5
            if(num == 5){
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
