package dataStructure.stackandqueue;

import java.util.Stack;

public class PalindromeEx {

    public static void main(String[] args) {
        /**
         * 스택
         * 회문 검사 : 앞으로 읽으나 뒤로 읽으나 같은 문자열
         * - 전반부의 문자들을 스택에 push, 후반부의 각 문자를 차례대로 pop한 문자와 비교.
         * 1. 문자열 길이가 짝수 : 반만 넣고, 빼면서 후반부 문자와 비교
         * 2. 문자열 길이가 홀수 : 반만 넣고, 중간 char은 버리고, 후반부와 비교.
         */

        String palindrome = "RACECAR";

        Stack<Character> stack = new Stack<>();

        if (palindrome.length() % 2 == 0) {
            for (int i = 0; i < palindrome.length() / 2; i++) {
                stack.push(palindrome.charAt(i));
            }
            for (int i = palindrome.length() / 2; i < palindrome.length(); i++) {
                if (stack.peek() == palindrome.charAt(i)) {
                    stack.pop();
                }
            }
        } else {
            for (int i = 0; i < palindrome.length() / 2; i++) {
                stack.push(palindrome.charAt(i));
            }
            for (int i = (palindrome.length() / 2) + 1; i < palindrome.length(); i++) {
                if (stack.peek() == palindrome.charAt(i)) {
                    stack.pop();
                }
            }
        }

        System.out.println("stack.isEmpty() : " + stack.isEmpty());
    }
}
