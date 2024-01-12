package constructor;

/**
 * 2023-12-29
 */
public class Constructor01 {

    public static void main(String[] args) {
        Hello hello = new Hello(); // 기본 생성자
        System.out.println();
        Hello hello2 = new Hello("홍길동", 99); // 생성자 오버로딩
        System.out.println();
        Hello hello3 = new Hello(30); // 생성자 오버로딩
        System.out.println();
        Hello hello4 = new Hello("이규찬"); // 생성자 오버로딩
        System.out.println();
        System.out.println(hello);
        System.out.println(hello2);
        System.out.println(hello3);
        System.out.println(hello4);
    }
}

// ----------

class Hello {

    private String name;
    private int age;

     Hello() {
         System.out.println("Hello 생성자 호출");
     }

    // 생성자 오버로딩
    Hello(String name, int age) {
         this();
         System.out.println("이름 나이 생성자 호출");
         this.name = name;
         this.age = age;
    }

    // this() : 생성자는 오버로드된 다른 생성자를 불러올 수 있음.
    Hello(int age) {
         this("기본값", age);
         System.out.println("나이 생성자 호출");
    }

    Hello(String name) {
        this(name, 28);
        System.out.println("이름 생성자 호출");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}