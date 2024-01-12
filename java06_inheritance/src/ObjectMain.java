/**
 * 2024-01-03
 */
public class ObjectMain {
    /**
     * Object : 최상위 객체.
     *  -hasCode() : 객체마다 고유번호 생성한것을 10진수로 보여줌.
     *  -equals() : 주소 참조값 비교
     *  -toString() : 객체 정보 = 클래스@16진수 형식.
     *  -- 오버라이드하여 재정의해서 사용함.
     *  -- 보통 동등비교할때 hashCode, equals 함수를 재정의하여 그 클래스 상황에 맞게 비교함.
     *  -- toString : 클래스의 정보를 문자열로 볼 수 있도록 재정의함.
     */

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.equals(test));
        System.out.println(test.hashCode());
        System.out.println(test);

        String str = "apple";
        System.out.println(str);
        // toString() override하여 문자열 제공
        System.out.println(str.equals("pizza"));
        System.out.println(str.hashCode());
        // 10진수로 표현된 해시코드값은 표현이 미처 안되는 경우가 있으므로 완전히 믿을 수 없다.

        String aa = new String("aa");
        String bb = new String("aa");
        System.out.println("aa == bb  : " + (aa == bb)); // 주소 참조값 비교
        System.out.println("aa.equals(bb)  : " + (aa.equals(bb))); // 문자열 내용 비교 오버라이딩.
        System.out.println();

        Object cc = new Object();
        Object dd = new Object();
        System.out.println("cc == dd  : " + (cc == dd)); // 주소 참조값 비교
        System.out.println("cc.equals(dd)  : " + (cc.equals(dd))); // 주소 참조값 비교
        System.out.println();

        Object ee = new String("zz");
        Object ff = new String("zz");
        System.out.println("ee == ff  : " + (ee == ff)); // 주소 참조값 비교
        System.out.println("ee.equals(f)  : " + (ee.equals(ff))); // 자식의 오버라이딩 메서드가 우선권. 문자열 비교.
        System.out.println();

    }
}


class Test {

    @Override
    public String toString() {
        return getClass() + " toString()";
    }

//    @Override
//    public int hashCode() {
//        return (int) (Math.random() * 10000);
//    }

//    @Override
//    public boolean equals(Object obj) {
//        return this == obj;
//    }
}