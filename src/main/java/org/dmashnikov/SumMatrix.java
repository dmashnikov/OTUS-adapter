package org.dmashnikov;

public interface SumMatrix {
    int[][] readFile(String filePath);
    int[][] sumMatrix(int[][] first, int[][] second);
    void writeMatrixToFile(int[][] matrix, String filePath);
}
