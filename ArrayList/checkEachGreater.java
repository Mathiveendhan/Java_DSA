package ArrayList;
import java.util.*;
public class checkEachGreater {
    static Stack<Integer> stack = new Stack<>();
   static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String args[]) {
        arr.add(6);
        arr.add(8);
        arr.add(0);
        arr.add(1);
        arr.add(3);
        int size=arr.size();
        int num1=0;
        int num2=0;
        for(int i=0;i<size-1;i++){
             num1=arr.get(i);
             num2=arr.get(i+1);
             if(num1<num2){
                 stack.push(num2);
             }else {
                 stack.push(-1);
             }
        }
        stack.push(-1);

        System.out.println("before operation:"+arr);
        System.out.println("After operation:"+stack);
  }

}
