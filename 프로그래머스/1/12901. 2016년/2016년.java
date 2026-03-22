import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int a, int b) {
        // 월
        Map<Integer, Integer> month = new HashMap<>();
        // 31일
        month.put(1, 31);
        month.put(3, 31);
        month.put(5, 31);
        month.put(7, 31);
        month.put(8, 31);
        month.put(10, 31);
        month.put(12, 31);
        
        // 2월 (윤년)
        month.put(2, 29);
        
        // 30일
        month.put(4, 30);
        month.put(6, 30);
        month.put(9, 30);
        month.put(11, 30);
        
        // 요일
        Map<Integer, String> day = new HashMap<>();
        day.put(1, "FRI");
        day.put(2, "SAT");
        day.put(3, "SUN");
        day.put(4, "MON");
        day.put(5, "TUE");
        day.put(6, "WED");
        day.put(0, "THU");
        
        int sum = 0;
        for(int i=1; i<a; i++){
            sum += month.get(i);
        }
        
        return day.get((sum+b)%7);
    }
}