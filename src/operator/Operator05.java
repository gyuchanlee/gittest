package operator;

/**
 * 2023-12-21
 */
public class Operator05 {

    public static void main(String[] args) {
        boolean a = 25 > 36;
        System.out.println("a = " + a); // false
        System.out.println("!a = " + !a); // true : 부정연산자 NOT
        System.out.println();

        String b = "apple";
        String c = new String("apple");
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("b equals c (문자열 내용 비교) : " + b.equals(c)); // 문자열 내용 비교는 equals() 사용!!!
        System.out.println("b == c (== 주소값 비교) : " + (b == c));
        System.out.println("b != c : " + (b != c)); // 같지않다
        System.out.println(System.identityHashCode(b)); // b 고유 해시코드
        System.out.println(System.identityHashCode(c)); // c 고유 해시코드

    }
}
