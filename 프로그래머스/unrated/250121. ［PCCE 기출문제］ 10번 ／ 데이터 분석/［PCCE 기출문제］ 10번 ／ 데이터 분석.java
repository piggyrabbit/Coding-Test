import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        // Determine the indexes for ext and sort_by
        int extIndex = getIndex(ext);
        int sortByIndex = getIndex(sort_by);

        // Filter the data
        int[][] filteredData = Arrays.stream(data)
                                     .filter(row -> row[extIndex] < val_ext)
                                     .toArray(int[][]::new);

        // Sort the filtered data
        Arrays.sort(filteredData, (a, b) -> Integer.compare(a[sortByIndex], b[sortByIndex]));

        return filteredData;
    }

    // Helper method to get the index based on the column name
    private int getIndex(String columnName) {
        switch (columnName) {
            case "code":
                return 0;
            case "date":
                return 1;
            case "maximum":
                return 2;
            case "remain":
                return 3;
            default:
                throw new IllegalArgumentException("Invalid column name");
        }
    }
}
