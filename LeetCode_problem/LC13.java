package LeetCode_problem;

import java.util.*;
public class LC13 {
        final static HashMap<Character,Integer>set=new HashMap<>();
        public static  int romanToInt(String s) {
            set.put('I',1);
            set.put('V',5);
            set.put('X',10);
            set.put('L',50);
            set.put('C',100);
            set.put('D',500);
            set.put('M',1000);
            s=s.replace("IV","IIII");
            s=s.replace("IX","VIIII");
            s=s.replace("XL","XXXX");
            s=s.replace("XC","LXXXX");
            s=s.replace("CD","CCCC");
            s=s.replace("CM","DCCCC");

            int n=0;
            for(int i=0;i<s.length();i++){
                n=n+set.get(s.charAt(i));
            }
            return n;
        }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
