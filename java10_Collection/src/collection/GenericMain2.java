package collection;

/**
 * 2024-01-08
 */
public class GenericMain2<T> {

    private T name;

    public GenericMain2() {}

    public GenericMain2(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {

        // ? : Object
        GenericMain2<?> genericMain2 = new GenericMain2<String>("푸바오");
//        genericMain2.setName("푸바오");
        System.out.println(genericMain2.getName());

        GenericMain2<?> genericMain3 = new GenericMain2<>(25);
        System.out.println((int) genericMain3.getName());
    }
}
