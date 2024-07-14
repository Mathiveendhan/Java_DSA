package Recursion;

public class PrintSubsequence {
    public static void printsub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
       char ch=str.charAt(0);
        printsub(str.substring(1),ans+ch);
        printsub(str.substring(1),ans);

    }
    public static void main(String args[]){
        printsub("abc","");
    }
}
