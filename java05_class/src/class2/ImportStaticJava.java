package class2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.String.format;
import static java.lang.System.*;
import static java.util.Arrays.*;

/**
 * 2024-01-02
 */
public class ImportStaticJava {

    public static void main(String[] args) {

        out.println("import static System");
        out.println("난수 = " + random());
        out.println("제곱 = " + pow(3, 4));

        out.println("소수이하 둘째자리  = " + format("%.2f", 34.789));

        Integer[] arr = {25, 37, 20, 78, 55};
        sort(arr);
        out.println("오름차순 정렬 = " + Arrays.toString(arr));

        sort(arr, Collections.reverseOrder());
        out.println("오름차순 정렬 = " + Arrays.toString(arr));

        Scanner scn = new Scanner(in);
        scn.close();

        // junit assertj Assertions 사용 때 요긴하게 사용.
    }
}
