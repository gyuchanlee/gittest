package constructor;

/**
 * 2023-12-29
 *
 *  * 클래스명 : Compute
 *  * 필드   : x, y, sum, sub, mul, div
 *  * 메소드  : 생성자(x, y)
 *  *         calc() - 합, 차, 곱, 몫을 계산
 *  *         getX()
 *  * 		getY()
 *  * 		getSum()
 *  * 		getSub()
 *  * 		getMul()
 *  * 		getDiv()
 */
public class Compute {

    private int x;
    private int y;
    private int sum;
    private int sub;
    private int mul;
    private double div;

    public Compute(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calc() {
        sum = x + y;
        sub = x - y;
        mul = x * y;
        div = (double) x / y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSum() {
        return sum;
    }

    public int getSub() {
        return sub;
    }

    public int getMul() {
        return mul;
    }

    public double getDiv() {
        return div;
    }

    @Override
    public String toString() {
        return "Compute{" +
                "x=" + x +
                ", y=" + y +
                ", sum=" + sum +
                ", sub=" + sub +
                ", mul=" + mul +
                ", div=" + div +
                '}';
    }
}
