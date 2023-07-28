class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arr = after.toCharArray();
        
        for (int i = 0; i < before.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                if (before.charAt(i) == arr[j]) {
                    arr[j] = '.';
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] != '.') return 0;
        }
        return 1;
    }
}