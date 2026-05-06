class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        // int var = 0;
       for(int i = 0 ; i < boxGrid.length ; i++) {
            for(int t = 0 ; t < boxGrid[i].length ; t++) {
                for(int j = boxGrid[i].length - 1 ; j > 0 ; j--) {
                    if(boxGrid[i][j] == '.' && boxGrid[i][j - 1] == '#') {
                        char temp = boxGrid[i][j];
                        boxGrid[i][j] = boxGrid[i][j - 1];
                        boxGrid[i][j - 1] = temp;
                    }
                }
            }
        }
        int n = boxGrid.length, m = boxGrid[0].length;
        char[][] box = new char[m][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                box[j][n-1-i] = boxGrid[i][j];
            }
        }
        return box;
    }
}