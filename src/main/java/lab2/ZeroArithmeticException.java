package lab2;

public class ZeroArithmeticException extends ArithmeticException {
    public ZeroArithmeticException() {
        super("Нельзя делить на 0");
    }
}
