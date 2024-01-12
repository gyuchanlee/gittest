package homework;

public class Jinsu {

    public static void main(String[] args) {
        int dec = 250;
        String bin = Integer.toBinaryString(dec);
        String oct = Integer.toOctalString(dec);
        String hex = Integer.toHexString(dec);

        System.out.println("10진수 = " + dec);
        System.out.println("2진수 = " + bin.substring(0,4) + " " + bin.substring(4,bin.length()));
        System.out.println("8진수 = " + oct);
        System.out.println("16진수 = " + hex);

    }
}

/**
 * 숙제 1
 * [문제] 250을 저장한 후 2진수, 8진수, 16진수로 변환한 값을 출력하시오
 *
 * [조건]
 * 2진수, 8진수, 16진수로 변환시켜주는 메소드를 이용하시오 - Integer Class (toBinaryString, toHexString, toOctalString)
 *
 * [실행결과]
 * 10진수 = 250 (dec)
 * 2진수 = 1111 1010 (bin)
 * 8진수 = 372 (oct)
 * 16진수 = fa (hex)
 */