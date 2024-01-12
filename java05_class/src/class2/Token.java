package class2;

import java.util.StringTokenizer;

/**
 * 2023-12-29
 */
public class Token {

    public static void main(String[] args) {
        /**
         * ★ StringTokenizer(java.util)클래스와 String클래스의 split()
         * 1. 문자열을 분리할 때 사용
         * 2. 분리된 문자열을 Token이라고 한다. 3. StringTokenizer는 비어있는 값은 무시하고 split()는 비어있는 값도 인식한다
         */

        String str = "학원,집,,게임방";

        StringTokenizer st = new StringTokenizer(str, ",");
        System.out.println("토큰 개수 = " + st.countTokens());

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        System.out.println("----------------------");

        String[] arr = str.split(",");
        for (String data : arr) {
            System.out.println(data);
        }
    }
}
