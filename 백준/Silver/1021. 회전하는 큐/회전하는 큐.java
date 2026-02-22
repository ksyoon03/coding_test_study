import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> dq = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 총 큐의 수
        int m = sc.nextInt(); // 추출할 값의 수
        for(int i = 1; i <= n; i++){
            dq.add(i);
        }

        int arr[] = new int[m];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0; // 회전수
        for(int i = 0; i<arr.length; i++){
            int h = dq.size() / 2;
            int idx = dq.indexOf(arr[i]);
            if(idx <= h){
                while(arr[i] != dq.peek()){
                    dq.addLast(dq.poll());
                    cnt++;
                }
            }else{
                while(arr[i] != dq.peek()){
                    dq.addFirst(dq.pollLast());
                    cnt++;
                }
            }
            dq.poll();
        }
        System.out.println(cnt);
    }
}
