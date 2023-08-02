class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int a = arr1.length;
        int b = arr2.length;
        
        if (a < b) answer = -1;
        else if (a > b) answer = 1;
        else {
            int totalA = 0;
            int totalB = 0;
            
            for (int i = 0; i < arr1.length; i++) {
                totalA += arr1[i];
                totalB += arr2[i];
            }
            
            if (totalA > totalB) answer = 1;
            if (totalA < totalB) answer = -1;
            if (totalA == totalB) answer = 0;
            
        }
        
        return answer;
    }
}