import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++){
            map.put(i, phone_book[i]);
        }

        for(int i = 0; i < map.size() - 1; i++){
            for(int j = i + 1; j < map.size(); j++){
                if(map.get(j).startsWith(map.get(i))){
                    answer = false;
                    break;
                } else if(map.get(i).startsWith(map.get(j))){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
