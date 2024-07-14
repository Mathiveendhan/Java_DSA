package Stack_;

import java.util.*;
public class DeleteMiddle {
    static Stack<Integer> stack=new Stack<> ();
    public static void deleteMiddle(int sizeOf,int current){
        if(current==sizeOf/2){
            stack.pop();
            return;
        }
        int top=stack.pop();
        deleteMiddle(sizeOf,current+1);
        stack.push(top);
    }
    public static void main(String args[]){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int sizeOf=stack.size();
        System.out.println("original stack:"+stack);
        deleteMiddle(sizeOf,0);
        System.out.println("stack after delete middle:"+ stack);
    }
}
