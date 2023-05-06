package org.dmashnikov;

import java.io.File;

public class SumMatrixImpl implements SumMatrix {
    @Override
    public int[][] readFile(String filePath) {
        new File(filePath);

        return new int[0][];
    }

    @Override
    public int[][] sumMatrix(int[][] first, int[][] second) {
        int[][] matrixSum = new int[first.length][second[0].length];
        for (int y = 0; y < first.length; y++) {
            for (int x = 0; x < first[y].length; x++) {
                int numMatrix1 = first[y][x];
                int numMatrix2 = first[y][x];
                int sum = numMatrix1 + numMatrix2;
                matrixSum[y][x] = sum;
            }
        }
        return matrixSum;
    }

    @Override
    public void writeMatrixToFile(int[][] matrix, String filePath) {

    }
}
