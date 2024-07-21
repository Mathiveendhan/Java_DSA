package LeetCode_problem;

public class LC171 {
        public static int titleToNumber(String columnTitle) {
            int total = 0;
            for (int i = 0; i < columnTitle.length(); i++) {
                total = total * 26 + columnTitle.charAt(i) - 'A' + 1;
            }
            return total;
        }

        public static void main(String[] args) {

            String columnTitle1 = "A";
            String columnTitle2 = "AB";
            String columnTitle3 = "ZY";

            int number1 = titleToNumber(columnTitle1);
            int number2 = titleToNumber(columnTitle2);
            int number3 = titleToNumber(columnTitle3);

            System.out.println(columnTitle1 + " -> " + number1);
            System.out.println(columnTitle2 + " -> " + number2);
            System.out.println(columnTitle3 + " -> " + number3);
        }

}
