package homework;

import java.util.Arrays;

/**
 * 2023-12-26
 */
public class CharCount {

    public static void main(String[] args) {

        char[] arr = new char[50];

        // 난수 발생
        for (int i = 0; i < arr.length; i++) {
            char rand = (char) (Math.random() * (90 - 65 + 1) + 65);
            arr[i] = rand;
        }
        
        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        // 알파벳 개수 구하기

        int[] count = new int[26];

        for (int i = 'A'; i <= 'Z'; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    cnt++;
                }
            }
            count[i-'A'] = cnt;
            System.out.println((char) i + " : " + cnt);
        }

        System.out.println(Arrays.toString(count));

    }
}

/**
 * [문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
 * - 1줄에 10개씩 출력
 * - A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?
 *
 * [실행결과]
 * D F A G H I J K L T
 * O P W E R F V A S B
 * P Y R O L E E Z L I
 * F E U Z T U P P P A
 * S P G B F F O W J C
 *
 * A : 2
 * B : 3
 * ...
 * X : 0
 * Y : 1
 * Z : 0
 */