package class_;

/**
 * 2023-12-28
 */
public class PersonMain {

    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "홍길동";
//        person.age = 25;
        person.setName("홍길동");
        person.setAge(25);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println();

        Person personB = new Person();
        personB.setName("코난");
        personB.setAge(13);
        System.out.println(personB);
        System.out.println();

        Person personC = new Person();
        personC.setData("라이언", 30);
        System.out.println(personC);
        System.out.println();
    }
}

class Person {

    // private 접근제어자로 함부로 외부에서 조작하지 못하도록 설정 (캡슐화)
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setData() {}

}