package book;

import java.io.*;
import java.util.ArrayList;

/**
 * 2024-01-08
 */
public class BookFileWrite implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list, boolean isSorted) throws IOException {

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/book.txt"));
        list.forEach((book) -> {
            try {
                oos.writeObject(book);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        oos.close();
    }
}
