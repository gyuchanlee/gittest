package io;

import java.io.*;

/**
 * 2024-01-08
 */
public class DataStream {

    public static final String TEST_RESULT_TXT = "d:/test/result.txt";

    public static void main(String[] args) throws IOException {
        /**
         * DataStream : 바이트 배열로 입출력
         * PrintStream : println, printf, print() 메서드. > 가장 간단한 이용이 가능.
         *
         * 다썼으면 자원반납.
         */

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(TEST_RESULT_TXT));
        dos.writeUTF("홍길동 ");
        dos.writeInt(25);
        dos.writeDouble(185.5);
        dos.flush();
        dos.close();

        // 파일로부터 입력 받기 > 파일명과 읽어오는 순서가 맞아야 함 (Exception 발생!!)
        DataInputStream dis = new DataInputStream(new FileInputStream(TEST_RESULT_TXT));
        String read1 = dis.readUTF(); // 들어간 순으로 읽기
        int read2 = dis.readInt();
        double read3 = dis.readDouble();
        dis.close();
        System.out.println(read1);
        System.out.println(read2);
        System.out.println(read3);

    }
}
