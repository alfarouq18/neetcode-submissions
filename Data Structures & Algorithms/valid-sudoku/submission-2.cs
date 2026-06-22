public class Solution {
    public bool IsValidSudoku(char[][] board) {
        
        for(int i = 0; i < 9; i++){
            HashSet<int> rowSet = new HashSet<int>();
            for(int k = 0; k < 9; k++){
                if(board[i][k] == '.'){
                    continue;
                }
                if(rowSet.Contains(board[i][k])){
                    return false;
                }
                rowSet.Add(board[i][k]);
            }  
        }

        for(int i = 0; i < 9; i++){
            HashSet<int> colSet = new HashSet<int>();
            for(int k = 0; k < 9; k++){
                if(board[k][i] == '.'){
                    continue;
                }
                if(colSet.Contains(board[k][i])){
                    return false;
                }
                colSet.Add(board[k][i]);
            }
        }
        
        Dictionary<int, HashSet<int>> map = new Dictionary<int, HashSet<int>>();
        for(int i = 0; i < 9; i++){
            map.Add(i, new HashSet<int>());
        }

        for(int i = 0; i < 9; i++){
            for(int k = 0; k < 9; k++){
                int index = (i / 3) * 3 + (k / 3);
                if(board[i][k] == '.'){
                    continue;
                }
                if(map[index].Contains(board[i][k])){
                    return false;
                }
                map[index].Add(board[i][k]);
            }
        }
        return true;

    }
}
