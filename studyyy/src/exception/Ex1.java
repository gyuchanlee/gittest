package exception;

public class Ex1 {

    public static void main(String[] args) {
        // NullPointerException
        String data = null;
//        String data = "null";
        try {
            int result = data.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생!!");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        } finally {
            System.out.println("finally는 예외가 발생하든 안하든 한번은 무조건 실행.");
        }

    }
}
