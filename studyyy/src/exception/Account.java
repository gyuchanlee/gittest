package exception;

public class Account {

    public static void main(String[] args) {
        try {
//            throw new InsufficientException();
            throw new InsufficientException("메시지");
        } catch (Exception e) {
            System.out.println("잡앗다");
            System.out.println(e.getMessage());
        }
    }
}
