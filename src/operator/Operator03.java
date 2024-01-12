package operator;

/**
 * 2023-12-21
 */
public class Operator03 {

    public static void main(String[] args) {
        /**
         * 할당 연산자 : =, +=, -=, *=, /=, %=
         *
         * ++, -- 연산자가 선행 후행에 붙느냐에 따라 결과값이 달라짐 (독립적으로 혼자쓰일때는 상관없음.)
         * ++a , a++ : 증감을 먼저하고 작업 수행 , 작업을 수행하고 그후에 증감.
         */
        int a = 5;
        a += 3; // a = a + 3
        a *= 2; // a = a * 2
        a /= 3; // a = a / 3
        a -= 4; // a = a - 4

        System.out.println("a = " + a); // a = 1

        int b = ++a;
        System.out.println("b = " + b); // b = 2

        int c = ++a - b--;
        System.out.println("c = " + c); // c = 1
        System.out.println("after a = " + a);
        System.out.println("after b = " + b);

        System.out.println();
        System.out.println("a++ = " + a++); // 3
        System.out.println("a = " + a); // 4
    }
}
