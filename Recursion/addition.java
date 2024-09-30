package Recursion;

import java.util.*;
public class addition {
    static int count=0;
    public static int add(int n,int i){
        if(i==n){
            return count;
        }
        count+=i;
        add(n,i+1);
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(add(100,0));
    }
}
