package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        // try() 안에 있는 자원은 자동으로 close() 메서드 호출
        // AutoClosealbe 인터페이스의 close() 메서드를 재정의한 클래스만 사용가능.
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            int read = fileInputStream.read();
            throw new IOException("ㅋㅋ~~");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "ㅇㅇ");
        }
    }
}
