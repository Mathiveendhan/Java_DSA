package LeetCode_problem;

import java.util.*;
public class LC682 {

    static Stack <Integer> stack=new Stack<>();
    static ArrayList <String> operator=new ArrayList<>();
    static Stack <Integer> answer=new Stack<>();


    public static void main(String args[]){
        String[] ops={"5","2","C","D","+"};
        String[] arr;
        for(int q=0;q<ops.length;q++){
            if(ops[q].equals("1")||ops[q].equals("2")||ops[q].equals("3")||ops[q].equals("4")||ops[q].equals("5")||ops[q].equals("6")||ops[q].equals("7")||ops[q].equals("8")||ops[q].equals("9")||ops[q].equals("0")) {
                int num = Integer.parseInt(ops[q]);
                stack.push(num);
            }
            if(ops[q].equals("C")||ops[q].equals("D")||ops[q].equals("+")){
                operator.add(ops[q]);
            }
        }
        for(int i=0;i<operator.size();i++){
            int num1=stack.peek();
            stack.pop();
            int num2=stack.peek();
            stack.pop();
            String op=operator.get(i);
            if(op.equals("C")){
                stack.push(num2);
                stack.push(0);
            }
            if(op.equals("D")){
                stack.push(num2);
                stack.push(num2*2);
            }
            if(op.equals("+")){
                stack.push(num2);
                stack.push(num1);
                stack.push(num1+num2);
            }
        }
        int total=0;
        while(!stack.isEmpty()){
            int n=stack.peek();
            total=total+n;
            stack.pop();
        }
        System.out.println(total);
    }
}
