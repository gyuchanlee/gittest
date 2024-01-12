package study;

public class Main {

    public static void main(String[] args) {
        Inter1 inter = new Gu1();

        inter.method1();
        inter.method2();
        ((Gu1)inter).method3();
    }
}
