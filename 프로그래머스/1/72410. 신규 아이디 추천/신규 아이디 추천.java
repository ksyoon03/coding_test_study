class Solution {
    public String solution(String new_id) {
        String answer = "";

        // 1
        answer = new_id.toLowerCase();

        // 2
        answer = answer.replaceAll("[^0-9a-z_.-]", "");

        // 3
        while(answer.contains("..")){
            answer = answer.replace("..", ".");
        }

        // 4
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5
        if(answer.isEmpty()){
            answer = "a";
        }

        // 6
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);

            if(answer.charAt(answer.length()-1) == '.'){
                answer = answer.substring(0, answer.length()-1);
            }
        }

        // 7
        char c = answer.charAt(answer.length()-1);
        while(answer.length() < 3){
            answer += c;
        }

        return answer;
    }
}
