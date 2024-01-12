package io;

import java.io.*;

/**
 * 2024-01-08
 */
public class ObjectMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/test/result2.txt"));
        oos.writeObject(new PersonDTO("홍길동", 25, 185.3, 80));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/test/result2.txt"));
        PersonDTO personDTO = (PersonDTO) ois.readObject();
        System.out.println(personDTO);
        ois.close();
        /**
         * 역직렬화에 취약점 >> 되도록 안쓰는 것이 좋음 or 역직렬화할 객체에 대한 철저한 인증 필요.
         */
    }
}
