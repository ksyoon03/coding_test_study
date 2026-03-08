import java.util.ArrayList;

public class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++){
            String s = String.valueOf(i);
            boolean b = true;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) != '0' && s.charAt(j) != '5'){
                    b=false;
                    break;
                }
            }
            if(b) list.add(i);
        }
        if(list.isEmpty()) return new int[] {-1};

        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
