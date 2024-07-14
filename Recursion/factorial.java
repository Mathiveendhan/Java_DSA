package Recursion;

import java .util.Scanner;
public class factorial{
    static int m=1;
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        m=m*n;
        return factorial(n-1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
        System.out.print(m);

    }
}
