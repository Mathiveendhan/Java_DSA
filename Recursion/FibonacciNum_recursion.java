package Recursion;

public class FibonacciNum_recursion {
    static int count=0;
    public static void fib(int n,int m,int idx,int target){
        idx++;
        int sum=n+m;
        if(target==idx){
            count= sum;
            return;
        }
        fib(m,sum,idx,target);
        return;
    }
    public static void main(String[] args){
        int n=0,m=1;
        int idx=2;
        int target=7;
        fib(0,1,2,7);
        System.out.println(count);
    }
}
