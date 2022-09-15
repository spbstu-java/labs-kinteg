package lab2;

import org.junit.jupiter.api.Test;

class MatrixReaderTest {
    private static final String writePath = "./fullMatrix.txt";

    @Test
    void test() {
        MatrixReader matrixReader = new MatrixReader();
        String readPath = getClass().getClassLoader().getResource("matrix.txt").getPath();

        // 1
        int[][] matrix = matrixReader.readMatrix(readPath);
        matrixReader.printMatrix(matrix, writePath, Boolean.FALSE);
        // 2
        matrix = matrixReader.createMatrix(5);
        matrixReader.printMatrix(matrix, writePath, Boolean.TRUE);
        // 3
        matrix = matrixReader.rotate90(matrix);
        matrix = matrixReader.devide(matrix);
        matrix = matrixReader.rotate180(matrix);
        matrix = matrixReader.devide(matrix);
        matrix = matrixReader.rotate270(matrix);
        matrix = matrixReader.devide(matrix);
        matrixReader.printMatrix(matrix, writePath, Boolean.TRUE);

    }

}