package nested;

/**
 * 2024-01-08
 */
public class AbstractMain {

    public static void main(String[] args) {

        // 익명 내부 클래스 활용 > 일회용으로 쓸 이름없는 객체 구현.
        AbstractTest abstractTest = new AbstractTest() {
            @Override
            public void setName(String name) {
                this.name = name;
            }
        };
        abstractTest.setName("zz");
        System.out.println(abstractTest.getName());

        // interface 생성 -> 익명 구현 클래스 (오버라이드할 메서드가 하나일시 쉽게 람다 활용가능)
        InterA interA = new InterA() {
            @Override
            public void aa() {
                System.out.println("AbstractMain.aa");
            }

            @Override
            public void bb() {
                System.out.println("AbstractMain.bb");
            }
        };
        interA.aa();
        interA.bb();

        // 추상메서드가 없는 추상클래스 생성
        AbstractExam abstractExam = new AbstractExam() {
            // 원하는 메서드를 오버라이드 (재정의 강제가 아님)
            @Override
            public void cc() {
                System.out.println("cc!!");
            }
        };
        abstractExam.cc();

    }
}
