import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() > 1){
            System.out.printf("%d ", q.poll());
            q.add(q.poll());
        }

        System.out.println(q.poll());
    }
}
