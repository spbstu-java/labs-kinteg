package lab2;

public class MatrixNotFoundException extends RuntimeException {

    public MatrixNotFoundException() {
        this(null);
    }

    public MatrixNotFoundException(String path) {
        super("Matrix from " + path + " not found");
    }
}
