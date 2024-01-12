package variable;

public class Variable01 {
    /**
     * 자료형
     * 1. 기본자료형
     * 2. 객체
     * 3. 배열
     */

    public static void main(String[] args) {
        boolean a; // 1bit but 컴퓨터 기본단위는 1byte라 1byte할당
        a = true;
        System.out.println("a = " + a);
        System.out.println();

        char b = 'A'; // 2Byte
        System.out.println("b = " + b);

        char c = 65; // 아스키코드
        char ex = 65535; // (0 - 65535) char 범위.
        System.out.println("c = " + c);
        System.out.println("ex = " + ex);
        System.out.println();

        int d = 65; // 4Byte, 32bit
        System.out.println("d = " + d);

        int e = 'A';
        System.out.println("e = " + e); // 정수형으로 넣었기때문에 숫자로만 출력.

        long f = 25L; // 8Byte, 64bit, 롱형 상수(25, 25L 모두가능) L은 long형에만 적용하겠다는 뜻.
        System.out.println("f = " + f);

        float g = 43.8f; // 4Byte, 실수형은 double형 상수. f리터럴을 붙여야한다.
        g = (float) 43.8; // 강제형변환
        System.out.println("g = " + g);

        double h = 12.45d; // 접미사로 f,d 둘 다 가능.
        System.out.println("h = " + h);

    }
}
