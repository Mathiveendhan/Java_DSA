package Recursion;

public class coinpath {
    public static void coin(int a,String ans){
        if(a==5){
            System.out.println(ans);
            return;
        }
        if(a>5){
            return;
        }
        coin(a+1,ans+1);
        coin(a+2,ans+2);
        coin(a+3,ans+3);
    }
    public static void main(String[] args) {
        String s="";
        coin(0,s);
    }
}