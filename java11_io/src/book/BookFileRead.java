package book;

import java.io.*;
import java.util.ArrayList;

/**
 * 2024-01-08
 */
public class BookFileRead implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list, boolean isSorted) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream((new FileInputStream("d:/book.txt")));

        list.clear(); // 먼저 있던 거 지워버리기.

        try {
            while (true) {
                BookDTO bookDTO = (BookDTO) ois.readObject();
                list.add(bookDTO);
            }
        } catch (EOFException e) {
            System.out.println("파일 목록 읽어오기 완료");
        }
        ois.close();
    }
}
