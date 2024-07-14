package Recursion;

public class factorialNum{
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int ans=n*factorial(n-1);
        return ans;

    }
    public static void main(String args[]){
        System.out.println(factorial(5));
    }
}