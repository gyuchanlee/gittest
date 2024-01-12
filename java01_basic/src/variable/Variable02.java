package variable;

public class Variable02 {
    /**
     * 자료형 2
     *
     */

    int a; // field, 초기값을 default로 0을 가짐. 인스턴스 변수
    static int b = 99; // static (정적), 클래스 변수, 정적 변수, static 영역에 메모리 적재. 클래스가 이값을 모두 공유.
    static double c;
    static String str;

    public static void main(String[] args) {
        int a; // local variable, 쓰레기값을 갖고있음(초기화하지 않았을 경우.)
        a = 100; // 초기화
        System.out.println("a = " + a);
        System.out.println();

        System.out.println("필드 a = " + new Variable02().a);
        System.out.println("필드 b = " + Variable02.b);
        System.out.println("필드 c = " + c);
        System.out.println("필드 str = " + str);
        str = "ㅇㅇ";
        System.out.println("변경 후 필드 str = " + str);

        // static은 인스턴스 메모리에 생성하지 않아도 b 필드를 가져올 수 있음.
        // static은 모든 인스턴스가 하나의 저장공간을 공유

    }
}
