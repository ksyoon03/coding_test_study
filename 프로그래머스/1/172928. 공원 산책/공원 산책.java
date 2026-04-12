class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0, 0};
        for(int i = 0; i < park.length; i++){
            if(park[i].indexOf("S") > -1){
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
                break;
            }
        }
        
        for(String route : routes){
            int x = answer[0];
            int y = answer[1];
            char direction = route.split(" ")[0].charAt(0);
            int distance = Integer.parseInt(route.split(" ")[1]);
            boolean b = true;
            for(int i=0; i<distance; i++){
                if(direction == 'N') x--;
                else if(direction == 'S') x++;
                else if(direction == 'E') y++;
                else if(direction == 'W') y--;
                
                if(x < 0 || y < 0 || x >= park.length || y >= park[i].length() || park[x].charAt(y) == 'X'){
                    b = false;
                    break;
                }
            }
            
            if(b){
                answer[0] = x;
                answer[1] = y;
            }
        }
        
        return answer;
    }
}