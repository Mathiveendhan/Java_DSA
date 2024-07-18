package LeetCode_problem;

public class LC202 {
    public static boolean isHappy(int n) {
        int m, result = 0;
        while (n != 1 && n != 4) {
            result = 0;
            while (n > 0) {
                m = n % 10;
                n /= 10;
                result += Math.pow(m, 2);
            }
            n = result;
        }
        return n != 4;
    }

    public static void main(String[] args) {
        int n = 19;
        boolean isHappy = isHappy(n);
        System.out.println(isHappy);

        n = 10;
        isHappy = isHappy(n);
        System.out.println(isHappy);

        n = 4;
        isHappy =isHappy(n);
        System.out.println(isHappy);
    }
}
