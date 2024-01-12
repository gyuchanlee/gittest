package exception;

/**
 * 2024-01-09
 */
public class MakeException extends Exception {
    // 체크 예외 상속

    /**
     * 기본생성자. 메시지생성자. toString() 오버라이딩 꼭하기.
     */

    private String message;
    private Throwable cause;

    public MakeException() {
        super();
    }

    public MakeException(String message) {
        super();
        this.message = message;
    }


    @Override
    public String toString() {
        return message;
    }
}
