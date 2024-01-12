package inheritance;

/**
 * 2024-01-02
 */
public class TestMain {

    public static void main(String[] args) {

        BB bb = new BB();
        bb.display();
        System.out.println(bb.a);

        AA aa = new BB(); // 다형성 : 부모에 자식 클래스가 자동으로 대입될 수 있음.
        // 항상 오버라이드된 자식 메서드가 우선권을 가짐.
        aa.display();
        System.out.println(aa.a);
        // AA를 가르키므로 AA의 필드값을 가져옴.

        BB cc = (BB) aa; // 다형성을 이용해 바꾼 부모는 자식에 부모를 대입할 경우 강제형변환이 필요. (실제 new BB클래스라 가능.)
        cc.display();
        System.out.println(cc.a);

        AA dd = new AA();
        dd.display();
        System.out.println(dd.a);

        BB ee = (BB) dd; // 캐스팅 > 문법만 수행되고 실제로는 안됨.
        // new AA()로 AA 클래스만 생성했기때문에 BB의 기능이 없어서 캐스팅을 할 수 없음.

        /**
         * 기본적으로 자식은 부모의 역할을 대신할 수 있지만,
         * 부모는 자식의 역할을 할 수 없음 (보통 자식 클래스의 기능과 범위가 부모의 것보다 훨씬 넓기 때문.)
         * But. 자식이 부모에 대입되어 형변환이 되었다가 다시 부모로 대입되어 형변환되는 것은 가능 (실제로 자식 클래스 객체를 참조함)
         */
    }
}

class AA {
    public int a = 3;

    public void display() {
        a += 5;
        System.out.println("AA : " + a + " ");
    }
}

class BB extends AA {
    public int a = 8;

    @Override
    public void display() {
        this.a += 5;
        System.out.println("BB : " + a + " ");
    }
}