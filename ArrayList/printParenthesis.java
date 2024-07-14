package ArrayList;

import java.util.ArrayList;

public class printParenthesis {
    static ArrayList<String> list = new ArrayList<>();
    public static void print(int n, int open, int close, String ans) {
        if (open == 3 && close == 3) {
            list.add(ans);
            return;
        }
        if (open > 3 || close > 3) {
            return;
        }
        print(n + 1, open + 1, close, ans + "(");
        if (close < open) {
            print(n + 1, open, close + 1, ans + ")");
        };
    }
    public static void main(String args[]){
        int n=0;
        print(n,0,0,"");
        for(String s:list){
            System.out.println(s);
        }
    }
}
