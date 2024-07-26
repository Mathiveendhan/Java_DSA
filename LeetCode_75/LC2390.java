package LeetCode_75;

import java.util.Stack;
public class LC2390 {
        public static void main(String[] args) {
            String input = "abc*d*e*f**ghi";
            String result = removeStars(input);
            System.out.println("String after removing stars: " + result);
        }
        public static String removeStars(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '*') {
                    stack.push(s.charAt(i));
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            Stack<Character> reversedStack = new Stack<>();
            while (!stack.isEmpty()) {
                reversedStack.push(stack.pop());
            }
            StringBuilder result = new StringBuilder();
            while (!reversedStack.isEmpty()) {
                result.append(reversedStack.pop());
            }
            return result.toString();
        }
}
