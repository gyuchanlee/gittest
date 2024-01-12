package dataStructure.stackandqueue;

public class Main {

    public static void main(String[] args) {

        ArrayStack<String> stack = new ArrayStack<>();
//        stack.peek(); // 비어있을 시, underflow 발생
        stack.push("apple");
        System.out.println(stack.peek());
        String pop = stack.pop();
        System.out.println(pop);
    }
}
