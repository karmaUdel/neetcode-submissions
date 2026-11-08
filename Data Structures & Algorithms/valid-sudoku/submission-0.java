class Solution {
    public boolean isValidSudoku(char[][] board) {

        // scan row
        for(int i = 0; i < 9 ; i++){
            int[] row = new int[9];
            for(int j = 0; j<9 ; j++){
                char c = board[i][j];
                if (c=='.'){
                    continue;
                }
                int pos = (c- '0')-1;
                if (row[pos] >= 1){
                    return false;
                }
                row[pos]++; 
            }
        }
        // scan column
        for(int i = 0; i < 9 ; i++){
            int[] row = new int[9];
            for(int j = 0; j<9 ; j++){
                char c = board[j][i];
                if (c=='.'){
                    continue;
                }
                int pos = (c- '0')-1;
                if (row[pos] >= 1){
                    return false;
                }
                row[pos]++; 
            }
        }
        // scan 3*3
    
        for(int i = 0; i < 9; i++){
            
            int[] a = new int[9];
            for(int j = 0; j<3 ; j++){
                for(int k = 0; k<3; k++) {
                    int row = (i / 3) * 3 + j;
                    int col = (i % 3) * 3 + k;
                    char c = board[row][col];
                    if (c =='.'){
                        continue;
                    }
                    int pos = (c- '0')-1;
                    if (a[pos] > 0){
                        return false;
                    }
                    a[pos]++; 
                
 
                }
            
            }
        }

        return true;
    }
}
