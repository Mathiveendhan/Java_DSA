package Stack_;

import java.util.Stack;

public class reverseString {
    public static void main(String args[]){
        Stack<String> stack=new Stack<>();
        stack.push("h");
        stack.push("e");
        stack.push("l");
        stack.push("l");
        stack.push("o");
        //System.out.println(stack);

        while(!stack.isEmpty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
}
