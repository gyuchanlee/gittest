package io;

import java.io.*;

/**
 * 2024-01-08
 */
public class BufferedReaderWriter {

    public static void main(String[] args) throws IOException {
        /**
         * 보조 스트림 Buffered (성능 향상을 위한 버퍼 사용) >> 자바 알고리즘 할 때 종종 사용하기.
         * Reader Writer : 입출력 스트림을 문자열로 받을 때 사용
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String read = br.readLine();
        br.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(read);
        bw.write(" Buffered Reader & Writer");
        bw.flush();
        bw.close();
    }
}
