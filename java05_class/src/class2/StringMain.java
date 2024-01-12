package class2;

/**
 * 2023-12-29
 */
public class StringMain {

    public static void main(String[] args) {

        String a = "apple";
        String b = "apple";

        if (a == b) {
            System.out.println("a와 b의 참조값은 같다");
        } else {
            System.out.println("a와 b의 참조값은 다르다");
        }

        if (a.equals(b)) {
            System.out.println("a와 b의 문자열은 같다");
        } else {
            System.out.println("a와 b의 문자열은 다르다");
        }
        System.out.println();
        /**
         * string constant pool(heap 영역에 포함됨)에 저장된 값을 참조해오기 때문에 같은 값을 가르킴.
         */

        // literal 생성 가능 (new 없이 생성)
        String c = new String("apple");
        String d = new String("apple");

        if (c == d) {
            System.out.println("c와 d의 참조값은 같다");
        } else {
            System.out.println("c와 d의 참조값은 다르다");
        }

        if (c.equals(d)) {
            System.out.println("c와 d의 문자열은 같다");
        } else {
            System.out.println("c와 d의 문자열은 다르다");
        }
        System.out.println();
        /**
         * Heap 영역에 new 생성자로 각각 객체가 만들어졌기 때문에 서로 다른 객체를 가르킴.
         *
         * String을 계속 더하면 더하는 만큼 객체가 새로 생성 > 무분별한 객체 생성으로 GC 발생가능성!
         */

        String e = "오늘 날짜는 " + 2023 + 12 + 29;
        System.out.println("e = " + e);
        System.out.println("문자열의 크기 : " + e.length());
        System.out.println("5번째 위치의 문자 : " + e.charAt(5));
        System.out.println();

        System.out.println("부분 문자열 추출 = " + e.substring(7));
        System.out.println("부분 문자열 추출 = " + e.substring(7, 11)); // begin <= 범위 < end

        System.out.println("대문자 변경 = " + "HelloWorld".toUpperCase());
        System.out.println("소문자 변경 = " + "HelloWorld".toLowerCase());

        System.out.println("문자열 검색 = " + e.indexOf("짜"));
        System.out.println("문자열 검색 = " + e.indexOf("날짜"));
        System.out.println("문자열 검색 = " + e.indexOf("개바부"));

        System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));

        /**
         * - StringBuffer
         *  메서드에 synchronized 붙음 > 멀티 스레드환경에서 동기화 지원, thread-safe함
         *  대신 동기화 처리로 인해 빌더보다 성능이 낮음.
         *
         *
         * - StringBuilder
         * 단일 스레드 환경에서 문자열을 계속 더할때 가장 나은 성능을 보임.
         *
         *
         */
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("오늘 날짜는 ");
        stringBuffer.append(2023);
        stringBuffer.append(12);
        stringBuffer.append(29);
        System.out.println(stringBuffer);




    }
}
