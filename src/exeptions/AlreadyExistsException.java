package exeptions;

public class AlreadyExistsException extends Exception {
    public AlreadyExistsException() {
        super("Product already exists");
    }

    public AlreadyExistsException(String msg) {
        super(msg);
    }
}
