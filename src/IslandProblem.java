public class IslandProblem {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (grid[i][j] == '1') {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        // boundary check
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }

        // mark visited
        grid[i][j] = '0';

        // explore neighbors
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        IslandProblem solution = new IslandProblem();

        char[][] grid = {
                {'1','1','0','0'},
                {'1','1','0','0'},
                {'0','0','1','0'},
                {'0','0','0','1'}
        };

        int result = solution.numIslands(grid);
        System.out.println("Number of Islands: " + result); // Output: 3
    }
}