package LeetCode_problem;

public class LC168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder bd = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber = columnNumber - 1;
            bd.append((char) ((columnNumber % 26) + 'A'));
            columnNumber = columnNumber / 26;
        }
        return bd.reverse().toString();
    }

    public static void main(String[] args) {
        LC168 solution = new LC168();
        int columnNumber1 = 1;
        int columnNumber2 = 28;
        int columnNumber3 = 701;

        System.out.println(columnNumber1 + " -> " + solution.convertToTitle(columnNumber1));
        System.out.println(columnNumber2 + " -> " + solution.convertToTitle(columnNumber2));
    }
}
