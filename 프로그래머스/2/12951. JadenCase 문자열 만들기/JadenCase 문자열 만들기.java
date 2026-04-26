class Solution {
    public String solution(String s) {
        s = s.toLowerCase();

        String[]words = s.split(" ");
        for(int i=0; i<words.length; i++){
            if(!words[i].isBlank()){
                char first = Character.toUpperCase(words[i].charAt(0));
                String last = words[i].substring(1);
                words[i] = first + last;
            }
        }

        String answer = "";
        for(String word : words){
                answer += word + " ";
        }

        if(s.charAt(s.length()-1) == ' '){
            return answer;
        } else {
            answer = answer.substring(0, answer.length() - 1);
        }

        return answer;
    }
}