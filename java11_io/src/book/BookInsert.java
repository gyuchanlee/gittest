package book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-08
 */
public class BookInsert implements Book {

    @Override
    public void execute(ArrayList<BookDTO> list, boolean isSorted) {

        Scanner scn = new Scanner(System.in);
        System.out.print("등록할 책 코드 : ");
        String code = scn.next();
        System.out.print("등록할 책 제목 : ");
        String title = scn.next();
        System.out.print("등록할 책 작가 : ");
        String author = scn.next();
        System.out.print("등록할 책 가격 : ");
        int price = scn.nextInt();
        System.out.print("등록할 책 수량 : ");
        int quantity = scn.nextInt();
        System.out.print("등록할 책 출판사 : ");
        String company = scn.next();

        list.add(new BookDTO(code, title, author, price, quantity, company));
        System.out.println("등록이 완료되었습니다.");
    }
}
