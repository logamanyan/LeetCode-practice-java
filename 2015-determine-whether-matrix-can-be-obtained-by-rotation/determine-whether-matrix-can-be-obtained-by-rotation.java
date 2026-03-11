class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        for (int r = 0; r < 4; r++) {
            if (check(mat, target)) {
                return true;
            }

            rotate(mat);
        }
        return false;
    }

    public boolean check(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void rotate(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            int l = 0, h = n - 1;
            while (l < h) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][h];
                mat[i][h] = temp;
                l++;
                h--;
            }
        }
    }
}