package dataStructure.list;

public class TestMain {

    public static void main(String[] args) {
        ArrList<String> list = new ArrList<>();
        list.insertLast("apple");
        list.insertLast("apple2");
        list.insertLast("pear");
        list.insertLast("berry");
        list.insertLast("orange");
        list.insertLast("grape");
        list.insertLast("cherry");

        list.delete(0);
        list.delete(0);
        list.delete(0);
        list.delete(0);
        list.delete(0);
        list.delete(0);

    }
}
