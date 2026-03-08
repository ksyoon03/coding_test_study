import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int top = 0;
        boolean check = true;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            // 스택에 넣기 (+)
            if(x > top){
                for(int j = top + 1; j <= x; j++){
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                top = x;
            }

            // 맨 위를 비교
            if(x != stack.peek()){
                check = false;
                break;
            }

            // 스택에서 빼기 (-)
            sb.append("-").append("\n");
            stack.pop();
        }

        if(check) System.out.println(sb.toString());
        else System.out.println("NO");

    }
}
