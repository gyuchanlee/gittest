package book;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 2024-01-08
 */
public interface Book {

    void execute(ArrayList<BookDTO> list, boolean isSorted) throws IOException, ClassNotFoundException;

}
