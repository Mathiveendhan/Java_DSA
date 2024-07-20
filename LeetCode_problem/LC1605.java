package LeetCode_problem;

public class LC1605 {
    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];
        int i = m - 1, j = n - 1;
        while (i >= 0 && j >= 0) {
            if (rowSum[i] <= colSum[j]) {
                matrix[i][j] = rowSum[i];
                colSum[j] -= rowSum[i];
                i--;
            } else {
                matrix[i][j] = colSum[j];
                rowSum[i] -= colSum[j];
                j--;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {

        int[] rowSum = {5, 7, 10};
        int[] colSum = {4, 9};

        int[][] resultMatrix =restoreMatrix(rowSum, colSum);

        // Print the resulting matrix
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
