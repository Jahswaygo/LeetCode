/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start


import java.util.HashSet;

class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        for (int i = 0; i < 9; i++) 
        {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> subgridSet = new HashSet<>();
            
            for (int j = 0; j < 9; j++) 
            {
                // Check rows
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) 
                {
                    return false;
                }
                
                // Check columns
                if (board[j][i] != '.' && !colSet.add(board[j][i])) 
                {
                    return false;
                }
                
                // Check 3x3 subgrids
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                if (board[rowIndex + j / 3][colIndex + j % 3] != '.' && !subgridSet.add(board[rowIndex + j / 3][colIndex + j % 3])) 
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}

// @lc code=end

