class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int[][] map = new int[park.length][park[0].length()];
        
        int x = -1;
        int y = -1;
        
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = park[i].charAt(j);
                if (map[i][j] == 'S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        System.out.println(x);
        System.out.println(y);
        
        for (int i = 0; i < routes.length; i++) {
            // 이동 진행
            // 공원을 벗어나거나 장애물을 만난다면 해당 명령은 무효.
            
            int move = 0;
            
            if(routes[i].charAt(0) == 'N') {
                move = routes[i].charAt(2) - '0';
                
                if (!(x - move < 0) && !(x - move >= map.length)) {
                    int meet = 0;
                    // 장애물을 만난다면
                    for (int j = 1; j <= move; j++) {
                        if (map[x - j][y] == 'X') {
                            meet = 1;
                        }
                    }
                    if (meet == 0) x = x - move;
                }
            }
            if(routes[i].charAt(0) == 'S') {
                move = routes[i].charAt(2) - '0';
                
                if (!(x + move < 0) && !(x + move >= map.length)) {
                    int meet = 0;
                    // 장애물을 만난다면
                    for (int j = 1; j <= move; j++) {
                        if (map[x + j][y] == 'X') {
                            meet = 1;
                        }
                    }
                    if (meet == 0) x = x + move;
                }
            }
            if(routes[i].charAt(0) == 'W') {
                move = routes[i].charAt(2) - '0';
                
                if (!(y - move < 0) && !(y - move >= map[0].length)) {
                    int meet = 0;
                    // 장애물을 만난다면
                    for (int j = 1; j <= move; j++) {
                        if (map[x][y - j] == 'X') {
                            meet = 1;
                        }
                    }
                    if (meet == 0) y = y - move;
                }
            }
            if(routes[i].charAt(0) == 'E') {
                move = routes[i].charAt(2) - '0';   
                
                if (!(y + move < 0) && !(y + move >= map[0].length)) {
                    int meet = 0;
                    // 장애물을 만난다면
                    for (int j = 1; j <= move; j++) {
                        if (map[x][y + j] == 'X') {
                            meet = 1;
                        }
                    }
                    if (meet == 0) y = y + move;
                }
            }
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}