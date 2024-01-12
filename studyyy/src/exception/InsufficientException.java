package exception;

public class InsufficientException extends Exception {
    public InsufficientException() {
        super();
        System.out.println("잔고 부족 예외!!");
    }

    public InsufficientException(String message) {
        super(message);
        System.out.println("잔고 부족 예외!! message 버전");
    }
}
