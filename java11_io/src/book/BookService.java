package book;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 2024-01-08
 */
public class BookService {

    private ArrayList<BookDTO> list = new ArrayList<>();
    private Book book;

    private boolean isSorted = false;

    public void menu() throws IOException, ClassNotFoundException {

        while (true) {
            
            System.out.println("1. 등록");
            System.out.println("2. 출력");
            System.out.println("3. 파일 저장");
            System.out.println("4. 파일 읽기");
            System.out.println("5. 정렬");
            System.out.println("6. 끝");
            System.out.println();

            System.out.print("번호 선택 : ");
            Scanner scn = new Scanner(System.in);
            int select = scn.nextInt();
            
            if (select == 1) {
                // 등록
                book = new BookInsert();
            } else if (select == 2) {
                // 출력
                book = new BookPrint();
            } else if (select == 3) {
                // 파일저장
                book = new BookFileWrite();
            } else if (select == 4) {
                // 파일읽기
                book = new BookFileRead();
            } else if (select == 5) {
                // 책이름 내림차순 정렬
                book = new BookTitleDesc();
            } else if (select == 6) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("1-6번을 선택하세요");
                continue;
            }

            book.execute(list, isSorted);
            System.out.println();

            
        }
    }
}

/**
 * 메뉴
 * 1. 등록
 * 2. 출력
 * 3. 파일 저장 (book.txt)
 * 4. 파일 읽기
 * 5. 정렬 (책 제목 내림차순)
 * 6. 끝
 *
 * 번호 선택 :
 *
 * - 조건
 * 1.
 * 입력할 때는 데이터 중복 허용
 * book01   자바    김자바    35000  10 비트캠프
 * book02   스프링    이봄    40000  5 비트교육원
 * book01   자바    김자바    35000  8 비트캠프
 * book01   자바    김자바    35000  2 비트캠프
 *
 * 출력할 때는 같은 데이터는 묶어서 출력
 * book01	자바		김자바	35000   비트캠프    20	xxxxx
 * book02	스프링	이봄		40000   비트교육원   5	xxx
 * 
 * 2. 파일에 저장 할 때 입력한 그대로 저장
 *
 */