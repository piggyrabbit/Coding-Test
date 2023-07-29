class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        int maxX = board[0] / 2;
        int maxY = board[1] / 2;
        
        int idxX = 0;
        int idxY = 0;
        
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                idxX--;
            }
            if (keyinput[i].equals("right")) {
                idxX++;
            }
            if (keyinput[i].equals("up")) {
                idxY++;
            }
            if (keyinput[i].equals("down")) {
                idxY--;
            }
            
            if (idxX > maxX) idxX = maxX;
        if (idxY > maxY) idxY = maxY;
        if (idxX < maxX * -1) idxX = maxX * -1;
        if (idxY < maxY * -1) idxY = maxY * -1;
        }
        
        if (idxX > maxX) idxX = maxX;
        if (idxY > maxY) idxY = maxY;
        if (idxX < maxX * -1) idxX = maxX * -1;
        if (idxY < maxY * -1) idxY = maxY * -1;
        
        
        
        answer[0] = idxX;
        answer[1] = idxY;
        
        return answer;
    }
}