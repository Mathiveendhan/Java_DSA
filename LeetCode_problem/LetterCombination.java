package LeetCode_problem;

import java.util.*;

public class LetterCombination {
    static HashMap<Character, String> hp = new HashMap<>();
    static List<String> LetterList = new ArrayList<>();

    public static List<String> call(String str1, String str2, int a, int b) {
        if (a >= str1.length() && b >= str2.length()) {
            return LetterList;
        }
        if (a < str1.length() && b < str2.length()) {
            LetterList.add("" + str1.charAt(a) + str2.charAt(b));
        }
        if (b < str2.length() - 1) {
            call(str1, str2, a, b + 1);
        } else if (a < str1.length() - 1) {
            call(str1, str2, a + 1, 0);
        }
        return LetterList;
    }
    public static List<String> letterCombinations(String digits) {
        hp.put('2', "abc");
        hp.put('3', "def");
        hp.put('4', "ghi");
        hp.put('5', "jkl");
        hp.put('6', "mno");
        hp.put('7', "pqrs");
        hp.put('8', "tuv");
        hp.put('9', "wxyz");
        LetterList.clear();

        if (digits.length() == 2) {
            call(hp.get(digits.charAt(0)), hp.get(digits.charAt(1)), 0, 0);
        }
        return LetterList;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
