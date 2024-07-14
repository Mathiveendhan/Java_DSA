package LeetCode_problem;

import java.util.*;
public class LC202HappyNumber {
    static Stack<Integer> stack=new Stack<>();
    public static void checkHN(int num){
        int sum=0;
        if(num>10 && num<=99){
            int second=num%10;
            int first=num/10;
            sum=(first * first)+(second * second);
            if(stack.contains(sum)){
                System.out.println("it is not happy number");
                return;
            }
            stack.push(sum);
        }
        if (num>=100 && num<=999) {
            int Tfirst=num%10;
            int Tnum=num/10;
            int Tsecond=Tnum%10;
            int Tthird=Tnum/10;
            sum=(Tfirst*Tfirst)+(Tsecond*Tsecond)+(Tthird*Tthird);
            if(stack.contains(sum)){
                System.out.println("it is not happy number");
                return;
            }
            stack.push(sum);
        }
        if(stack.peek()==1){
            System.out.println("it is a happy number");
            return;
        }

        checkHN(sum);
    }
    public static void main(String[] args){
          int num=19;
          checkHN(num);
    }
}
