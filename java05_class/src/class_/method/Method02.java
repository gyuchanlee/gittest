package class_.method;

/**
 * 2023-12-28
 */
public class Method02 {

    // field
    int a;

    public static void main(String[] args) {
        int a; // 지역변수

        Method02 m = new Method02();
        System.out.println("합 = " + m.sum(25, 36));
        System.out.println("차 = " + m.sub(25, 36));
        System.out.println("곱 = " + m.mul(25, 36));
        System.out.println("몫 = " + String.format("%.4f", m.div(25, 36)));
    }

    // method
    public int sum(int a, int b) { // 인수, 매개변수
        return a + b;
    }

    public int sub(int a, int b) { // 인수, 매개변수
        return a - b;
    }
    public int mul(int a, int b) { // 인수, 매개변수
        return a * b;
    }

    public double div(int a, int b) { // 인수, 매개변수
        return (double) a / b;
    }
}
