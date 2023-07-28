class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] arr = my_string.split(" ");
        
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) answer += Integer.parseInt(arr[i]);
            else if (arr[i-1].equals("+")) {
                answer += Integer.parseInt(arr[i]);
            }
            else if (arr[i-1].equals("-")) {
                answer -= Integer.parseInt(arr[i]);
            }
        }
        
        return answer;
    }
}