package io;

import java.io.*;
import java.util.Arrays;

/**
 * 2024-01-08
 */
public class byteStream {

    public static final String TEST_DATA_TXT = "d:/test/data.txt";

    public static void main(String[] args) throws IOException {

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(TEST_DATA_TXT));
        bos.write("A".getBytes());
        bos.write("B".getBytes());
        bos.write("C".getBytes());
        bos.write("D".getBytes());
        bos.write("\n".getBytes());
        bos.write("1".getBytes());
        bos.write("2".getBytes());
        bos.write("3".getBytes());
        bos.write("4".getBytes());
        bos.write("\n".getBytes());
        bos.write("+".getBytes());
        bos.write("-".getBytes());
        bos.write("*".getBytes());
        bos.write("/".getBytes());
        bos.flush();
        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(TEST_DATA_TXT));
        int data;

        // bis.read()는 더이상 읽을 바이트가 없으면 -1을 리턴한다.
        while ((data = bis.read()) != -1) {
            System.out.print((char) data);
        }
        bis.close();

    }
}
