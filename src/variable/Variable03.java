package variable;

import java.util.Random;

public class Variable03 {

    int field;

    public static void doit() {
        // static 메서드
    }
    
    public void doit2() {
        // 메서드
    }

    public static void main(String[] args) {
        int big = Math.max(25, 36);
        System.out.println("더 큰 값 = " + big);

        double small = Math.min(12.3, 78.5);
        System.out.println("더 작은 값 = " + small);
        System.out.println();

        int sum = 2 + 5;
        System.out.println("합 = " + sum);
        int sum2 = '2' + '5'; // 아스키코드로 50 + 53과 같음.
        System.out.println("합2 = " + sum2);
        int sumP = '2' - '0' + '5' - '0';
        System.out.println("문자를 숫자로 바꾸기 = " + sumP);

        System.out.println("문자열 2 + 5 = " + (Integer.parseInt("2") + Integer.parseInt("5")));
        // Integer.parseInt() : 문자열을 int형으로 바꿔줌.
        System.out.println();

        float a = Float.parseFloat("43.8f");
        double b = Double.parseDouble("43.8");
        System.out.println("a + b = " + (a+b));
        System.out.println("a + b = " + String.format("%.2f",(a+b)));
        System.out.println();

        double rand = Math.random()*100;
        System.out.println(rand);

        // 65 - 90 사이의 난수 발생
        int d = (int) (Math.random() * (26) + 65);
        System.out.println("d = " + d);
        System.out.println("d = " + (char)d);

        double e = new Random().nextDouble(); // 0.0 < 난수 < 1.0
        System.out.println("e = " + e);

    }

    /**
     * 난수 : 컴퓨터가 불규칙하게 무작위로 발생시키는 수.
     * 0 < 난수 < 1
     *
     * * x - y 사이의 난수 발생 (정수)
     * (int)(Math.random() * (y-x+1) + x)
     * (int) Math.random() * (최댓값-최소값+1) + 최소값
     *
     * java.util.Random : 난수발생 전용 클래스.
     */
}
