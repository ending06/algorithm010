//--------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2020-07-26<p>
//-------------------------------------------------------

public class NumIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int column = grid[0].length;
        int count = 0;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] == '1') {
                    count = count + 1;
                    dfs(grid, r, c);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;

        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';

        dfs(grid, r - 1, c);

        dfs(grid, r + 1, c);

        dfs(grid, r, c - 1);

        dfs(grid, r, c + 1);
    }
}