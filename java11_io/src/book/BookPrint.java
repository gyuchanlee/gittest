package book;

import java.util.*;

/**
 * 2024-01-08
 */
public class BookPrint implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list, boolean isSorted) {

        // 중복 안된 제목 뽑아내기
        HashSet<String> titleSet = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            titleSet.add(list.get(i).getTitle());
        }
        List<String> title = titleSet.stream().toList();

        // 출력용 dto
        BookDTO[] bookDTOS = new BookDTO[title.size()];
        for (int i = 0; i < bookDTOS.length; i++) {
            bookDTOS[i] = new BookDTO(title.get(i));
        }

        // 같은 제목 찾아서 quantity, total 구하기
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < bookDTOS.length; j++) {
                if (list.get(i).getTitle().equals(bookDTOS[j].getTitle())) {
                    bookDTOS[j].setCode(list.get(i).getCode());
                    bookDTOS[j].setAuthor(list.get(i).getAuthor());
                    bookDTOS[j].setPrice(list.get(i).getPrice());
                    bookDTOS[j].changeQuantity(list.get(i).getQuantity());
                    bookDTOS[j].setCompany(list.get(i).getCompany());
                    bookDTOS[j].changeTotal(list.get(i).getTotal());
                }
            }
        }


        ArrayList<BookDTO> results = new ArrayList<>();
        results.addAll(Arrays.asList(bookDTOS));
//        if (isSorted) {
        if (true) {
            results.sort(Comparator.comparing(BookDTO::getTitle).reversed());
            isSorted = false;
        }
        // isSorted가 기본형이라 매개변수 값 복사만 되어 원본이 안바뀜. >> list는 변수가 주소 참조값을 복사해오므로 원본이 바뀜.

        // 출력
        System.out.println();
        for (BookDTO book : results) {
            System.out.printf(" %s\t%s\t\t%s\t%d\t%s\t%d\t%d\n",
                    book.getCode(), book.getTitle(), book.getAuthor(), book.getPrice(),
                    book.getCompany(), book.getQuantity(), book.getTotal());
        }

        if (bookDTOS.length == 0) {
            System.out.println("정보 없음");
        }
    }
}

/**
 *  * book01	자바		김자바	35000   비트캠프    20	xxxxx
 *  * book02	스프링	이봄		40000   비트교육원   5	xxx
 */