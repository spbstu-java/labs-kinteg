package lab2;

public class MatrixPrintException extends RuntimeException {
    public MatrixPrintException(String path) {
        super("Произошла ошибка при записи матрицы в файл: " + path);
    }
}
