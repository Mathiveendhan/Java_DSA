package ArrayList;
import java.util.*;

public class findGreaterEach {
    static ArrayList<Integer> arr=new ArrayList<>();
    static Stack<Integer> stack=new Stack<>();

    public static void main(String args[]){
        arr.add(4);
        arr.add(8);
        arr.add(5);
        arr.add(2);
        arr.add(25);
        int num1=0;
        int num2=0;
        int min=0;
        int size=arr.size();
        for(int i=0;i<size-1;i++){
            num1=arr.get(i);
            min=num1;
            for(int j=i;j<size-1;j++){
                num2=arr.get(j);
                if(num1>num2){
                    min=num2;
                    break;
                }
            }
            if(min==num1){
                stack.push(-1);
            }else{
                stack.push(min);
            }
        }
        stack.push(-1);
        System.out.println(stack);
    }
}
