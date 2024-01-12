package class_.method;

/**
 * 2023-12-28
 */
public class Method03 {

    public static void main(String[] args) {
        Method03 m = new Method03();

        System.out.println("합 = " + m.sum(10, 20));
        System.out.println("합 = " + m.sum(10, 20, 30));
        System.out.println("합 = " + m.sum(10, 20, 30, 40));
        System.out.println("합 = " + m.sum(10, 20, 30, 40, 50, 60)); // 가변인자
    }

    /**
     * 오버로딩 : 한 메서드의 매개변수의 타입, 개수, 순서만 바꿔서 같은 이름의 여러 개의 메서드를 만드는 것.
     */
    private int sum(int a, int b) {
        return a + b;
    }

    private int sum(int a, int b, int c) {
        return a + b + c;
    }

    private int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /** 매개변수에 가변인자가 올 수 있음!!
     * 가변인자는 기본적으로 배열화가 일어남.
     * 가변인자는 매개변수 중에서 제일 마지막에 선언해야 한다.
     */
    private int sum(int... param) {
        int num = 0;

//        for (int i = 0; i < param.length; i++) {
//            num += param[i];
//        }

        for (int a : param) {
            num += a;
        }

        return num;
    }


}
