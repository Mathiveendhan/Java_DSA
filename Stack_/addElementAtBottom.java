package Stack_;
import java.util.Stack;

public class addElementAtBottom {
    public static void main(String args[]){
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        Stack<Integer> s=new Stack<>();
        int num=5;
        while(!stack.isEmpty()){
            s.push(stack.peek());
            stack.pop();
        }
        Stack<Integer> str=new Stack<>();
        str.push(num);
        while(!s.isEmpty()){
            str.push(s.peek());
            s.pop();
        }
        while(!str.isEmpty()){
            System.out.println(str.peek());
            str.pop();
        }
    }
}
