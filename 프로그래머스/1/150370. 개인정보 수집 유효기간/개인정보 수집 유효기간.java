import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 약관 분리
        Map<String, Integer> termsMap = new HashMap<>();
        for(String t : terms){
            String[]tmp = t.split(" ");
            String first = tmp[0];
            int second = Integer.parseInt(tmp[1]);

            termsMap.put(first, second);
        }

        // 오늘 월일 분리
        String[]tempPart = today.split("\\.");
        int year = Integer.parseInt(tempPart[0]);
        int month = Integer.parseInt(tempPart[1]);
        int day = Integer.parseInt(tempPart[2]);
        int totalDay = year * 12 * 28 + month * 28 + day;

        // 개인정보 날짜 - 약관 분리
        String[]date = new String[privacies.length];
        String[]policy = new String[privacies.length];
        for(int i = 0; i< privacies.length; i++){
            String[] part = privacies[i].split(" ");
            date[i] = part[0];  // 날짜
            policy[i] = part[1]; // 약관
        }

        // 개인정보 월일 분리
        int[] privacyYear = new int[privacies.length];
        int[] privacyMonth = new int[privacies.length];
        int[] privacyDay = new int[privacies.length];
        int[] totalPrivDays = new int[privacies.length];
        for(int i = 0; i< privacyDay.length; i++){
            String[] part = date[i].split("\\.");

            privacyYear[i] = Integer.parseInt(part[0]);
            privacyMonth[i] = Integer.parseInt(part[1]);
            privacyDay[i] = Integer.parseInt(part[2]);

            totalPrivDays[i] += (privacyYear[i] * 12) * 28 + privacyMonth[i] * 28 + privacyDay[i];
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<privacies.length; i++){
            if(totalPrivDays[i] + termsMap.get(policy[i]) * 28 <= totalDay){
                arr.add(i+1);
            }
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }

        return answer;
    }
}