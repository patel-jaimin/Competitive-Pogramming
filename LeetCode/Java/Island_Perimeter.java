// 463. Island Perimeter
// You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.

// Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).

// The island doesn't have "lakes" (water inside that isn't connected to the water around the island). 
// One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. 
// Determine the perimeter of the island.

//  Example:

// Input:
// [[0,1,0,0],
//  [1,1,1,0],
//  [0,1,0,0],
//  [1,1,0,0]]

// Output: 16

class Solution {
    public int islandPerimeter(int[][] grid) {
        if(grid==null)
            return 0;
        int Perimeter = 0;
        for(int row= 0 ; row<grid.length; row++)
        {
            for(int col = 0 ; col<grid[0].length ; col++)
            {
                if(grid[row][col]==1)
                {
                    Perimeter+=Adjacent(grid, row, col);
                }
            }
        }
        return Perimeter;
        
    }
    private int Adjacent(int[][] grid,int row,int  col)
    {
        int count=0;
        if(row-1 < 0 || grid[row-1][col]==0)++count;
        if(row+1 >= grid.length || grid[row+1][col]==0)++count;
        if(col-1<0 || grid[row][col-1]==0)++count;
        if(col+1>=grid[0].length || grid[row][col+1]==0)++count;
        return count;
    }
}

