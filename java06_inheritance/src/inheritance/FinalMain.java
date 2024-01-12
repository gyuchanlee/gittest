package inheritance;

/**
 * 2024-01-03
 */
public class FinalMain {

    public static final int EX = 1000;
    public final int EE = 999;

    public static void main(String[] args) {
        final int AGE = 25;

        System.out.println("AGE = " + AGE);

        final String NAME;
        NAME = "길동이";
        System.out.println("NAME = " + NAME);
        System.out.println();

        Final aFinal = new Final("딸기");
        System.out.println(aFinal.FRUIT);
        System.out.println(aFinal.FRUIT2);
        System.out.println(Final.ANIMAL);
        System.out.println(Final.ANIMAL2);
        System.out.println();

        System.out.println(FinalMain.EX);
        System.out.println(new FinalMain().EE);
        System.out.println();

        System.out.println(Color.RED);
        System.out.println(Color.RED.ordinal());
        System.out.println(Color.GREEN);
        System.out.println(Color.BLUE);

        System.out.println();
        for (Color data : Color.values()) {
            System.out.println(data);
        }

        System.out.println(Color.RED.getNumber());

    }
}

class Final {
    public final String FRUIT = "사과";
    public final String FRUIT2;
    // 초기화를 하지 않았다면 생성자에서 값을 넣으면 됨.
    public static final String ANIMAL = "호랑이";
    // 상수를 제대로 거는법 : 전역변수 + 불변성
    public static final String ANIMAL2;
    // 스태틱은 생성자로 초기화 불가 >> static이 붙은 것들은 프로그램 실행 시, 스태틱영역에서 생성되기 때문.

//    public static final int RED = 0;
//    public static final int GREEN = 0;
//    public static final int BLUE = 0;


    // 생성자보다 더 빠른 초기화가 일어나는 스태틱 블럭에 초기화 가능!!
    static {
        ANIMAL2 = "기린";
    }

    Final(String fruit2) {
        FRUIT2 = fruit2;
    }
}

enum Color {
    RED("1"), GREEN("2"), BLUE("3");

    private String number;

    // 생성자
    Color(String number) {
        this.number = number;
    }

    // Getter
    public String getNumber() {
        return number;
    }
}
