package Recursion;

public class printParenthesis {
    public static void parenthesis(int n,int open,int close,String ans){
       if(open==n && close==n){
           System.out.println(ans);
           return;
       }
       if(open>n || close>n){
           return;
       }
        parenthesis(n,open+1,close,ans+"(");
       if(close<open){
           parenthesis(n,open,close+1,ans+")");
       }
    }
    public static void main(String args[]){
        parenthesis(3,0,0,"");
    }
}
