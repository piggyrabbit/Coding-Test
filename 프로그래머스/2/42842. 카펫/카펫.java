class Solution {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for (int width = 3; width <= area / width; width++) {
            if (area % width == 0) {
                int height = area / width;
                if ((width - 2) * (height - 2) == yellow) {
                    return new int[] {Math.max(width, height), Math.min(width, height)};
                }
            }
        }
        return new int[2];
    }
}
