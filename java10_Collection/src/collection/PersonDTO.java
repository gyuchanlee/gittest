package collection;

/**
 * 2024-01-04
 */
public class PersonDTO implements Comparable<PersonDTO> {


    private String name;
    private int age;

    public PersonDTO() {
    }

    public PersonDTO(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        return "PersonDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(PersonDTO o) {
        if (o.getAge() < this.getAge()) {
            return 1;
        } else if (o.getAge() > this.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
