package Recursion;

public class sumOfNatural{
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int ans=n+sum(n-1);
        return ans;
    }
    public static void main (String arg[]){
        int n=5;
        System.out.print(sum(n));
    }
}