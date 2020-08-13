// 200. Number of Islands

// Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

// Example 1:

// Input:
// 11110
// 11010
// 11000
// 00000

// Output: 1
// Example 2:

// Input:
// 11000
// 11000
// 00100
// 00011

// Output: 3

class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null) 
            return 0;
        int island = 0;
        for(int row = 0;row < grid.length; row++)
        {
            for(int col =0 ;col < grid[0].length; col++)
            {
                if(grid[row][col]=='1')
                {
                    island++;
                    SearchAdjacent(grid,row,col);
                }
            }
        }
            return island;
        }
        private void SearchAdjacent(char[][] grid,int row, int col)
        {
            if(row < 0 || row >= grid.length || col >= grid[0].length || col < 0 || grid[row][col]=='0')
                return;
            grid[row][col] = '0';
            SearchAdjacent(grid,row+1,col);
            SearchAdjacent(grid,row-1,col);
            SearchAdjacent(grid,row,col+1);
            SearchAdjacent(grid,row,col-1);
        }
        
    
}
