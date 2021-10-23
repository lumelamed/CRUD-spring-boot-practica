package dds.grupo2.patitasalrescate.controller.exceptions;

public class UnauthorizedException extends RuntimeException {
    public UnauthorizedException(String message) {
        super(message);
    }
}
