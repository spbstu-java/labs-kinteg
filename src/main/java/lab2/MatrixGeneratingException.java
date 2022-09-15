package lab2;

public class MatrixGeneratingException extends RuntimeException {
    public MatrixGeneratingException() {
        super("Произошла ошибка при создании матрицы");
    }
}
