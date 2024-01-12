package book;

import java.io.IOException;

/**
 * 2024-01-08
 */
public class BookMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BookService bookService = new BookService();
        bookService.menu();
    }
}
