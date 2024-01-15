import java.util.*;

class Solution {
    public int[] C;
    public int[][] dp;
    public Map<Integer, List<Integer>> map = new HashMap<>();

    public int dfs(int cur, int isContain) {
        if (dp[cur][isContain] != Integer.MAX_VALUE) return dp[cur][isContain];
        if (!map.containsKey(cur)) return isContain == 0 ? 0 : C[cur];

        int result = isContain == 0 ? 0 : C[cur];
        int minContainDiff = Integer.MAX_VALUE;
        boolean containExist = false;

        for (int i = 0; i < map.get(cur).size(); i++) {
            int target = map.get(cur).get(i);
            int notContain = dfs(target, 0);
            int contain = dfs(target, 1);
            minContainDiff = Math.min(minContainDiff, contain - notContain);
            if (notContain < contain) {
                result += notContain;
            } else {
                result += contain;
                containExist = true;
            }
        }

        if (isContain == 0 && !containExist)
            result += minContainDiff;

        return dp[cur][isContain] = result;
    }

    public int solution(int[] sales, int[][] links) {
        C = new int[sales.length + 1];
        dp = new int[sales.length + 1][2];
        for (int i = 0; i < sales.length + 1; i++)
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        for (int i = 0; i < sales.length; i++)
            C[i + 1] = sales[i];
        for (int i = 0; i < links.length; i++) {
            int from = links[i][0];
            int to = links[i][1];
            if (map.containsKey(from)) {
                map.get(from).add(to);
            } else {
                map.put(from, new ArrayList<>());
                map.get(from).add(to);
            }
        }

        return Math.min(dfs(1, 0), dfs(1, 1));
    }
}
