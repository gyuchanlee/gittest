package io;

import java.io.*;
import java.util.Arrays;

/**
 * 2024-01-08
 */
public class ByteStream2 {

    public static void main(String[] args) throws IOException {

        File file = new File("d:/test/data.txt");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));

        int size = (int) file.length();

        // 파일 크기만큼 배열잡기
        byte[] arr = new byte[size];

        // 파일 읽기
        int read = bis.read(arr, 0, size);
        System.out.println(read); // 읽은 바이트 수. 스트림의 끝에 도달한 경우 -1.

        System.out.println();
        System.out.println(new String(arr));
    }
}
