package Recursion;

//import java.util.Scanner;
public class sorting {
    public static void main(String args[]) {
        int arr[] = {10, 20, 30, 40};
        boolean ans = issorted(arr,0);
        System.out.println(ans);
    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        boolean ans= issorted(arr,i+1);
        return ans;
    }
}