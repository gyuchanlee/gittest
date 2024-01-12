package dataStructure.stackandqueue;

import java.util.Stack;

public class CompilerStackEx1 {

    public static void main(String[] args) {
        /**
         * 컴파일러의 {} 괄호 검사 > 결국 짝에 맞춰 괄호는 닫기기때문에 앞의 괄호와 뒤의 괄호가 만나는 것 부터 빼면 된다
         * 왼쪽 괄호는 push하고 push한 왼쪽 괄호를 peek한 것과 맞는 오른쪽 괄호가 있으면 짝이 맞는 것이니 pop하여 없앰.
         * 모두 짝이 맞다면 stack은 비어있고, 맞지않다면 개수가 남을 것이므로 error임.
         */
        String ex1 = "{([])}";
//        String ex1 = "{{([])}";
//        String ex1 = "{{{([])}}}";
//        String ex1 = "{{{([[])}}}}";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < ex1.length(); i++) {
            if (ex1.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                }
            } else if (ex1.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                }
            } else if (ex1.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                }
            } else {
                stack.push(ex1.charAt(i));
            }
        }
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
    }
}
