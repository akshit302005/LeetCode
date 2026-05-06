class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid[0].length;
        for(char[] arr : boxGrid) {
            int i = 0;
            for(int j = 0; j < n; j++) {
                if(arr[j] == '*') {
                    i = j+1;
                } else if (arr[j] != '#') {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                }
            }
        }
        n = boxGrid.length;
        int m = boxGrid[0].length;
        char[][] box = new char[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                box[i][j] = boxGrid[j][i];
            }
        }
        for(char[] arr : box) {
            int i = 0, j = arr.length-1;
            while(i<j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; j--;
            }
        }
        return box;
    }
}