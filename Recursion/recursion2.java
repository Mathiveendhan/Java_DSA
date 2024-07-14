package Recursion;

public class recursion2{
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printInc(n-1);
    }
    public static void main(String args[]){
        printInc(5);
    }
}

// output:
// 5
// 4
// 3
// 2
// 1