class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        // int[][] wall = new int[wallpaper[0].length()][wallpaper.length];
        
        // #이 위치하는 좌표들을 구함.
        // 그 좌표들을 토대로 x와 y의 최솟값, 최댓값을 구함
        
        int maxX = -1;
        int maxY = -1;
        
        int minX = 9999;
        int minY = 9999;
        
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (maxX < i) maxX = i;
                    if (minX > i) minX = i;
                    if (maxY < j) maxY = j;
                    if (minY > j) minY = j;
                }
            }
        }
        
        System.out.println(minX+""+minY+""+maxX+maxY);
        
        answer[0] = minX;
        answer[1] = minY;
        answer[2] = maxX + 1;
        answer[3] = maxY + 1;
        
        
        return answer;
    }
}