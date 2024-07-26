package LeetCode_75;

import java.util.*;
public class LC1732 {
        public static void main(String[] args) {
            int[] gain = {-5, 1, 5, 0, -7};
            int largestAltitude = largestAltitude(gain);
            System.out.println("Largest altitude reached: " + largestAltitude);
        }

        public static int largestAltitude(int[] gain) {
            int[] ans = new int[gain.length + 1];
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for (int i = 0; i < gain.length; i++) {
                st.push(st.peek() + gain[i]);
            }
            int max = 0;
            while (!st.isEmpty()) {
                int num = st.pop();
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }

}
