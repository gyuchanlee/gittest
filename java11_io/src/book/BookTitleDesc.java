package book;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 2024-01-08
 */
public class BookTitleDesc implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list, boolean isSorted) {

        list.sort(Comparator.comparing(BookDTO::getTitle).reversed());
        isSorted = true;
        System.out.println(" 제목 내림차순 정렬 완료.");
        for (BookDTO dto : list) {
            System.out.println(dto);
        }

    }

}
