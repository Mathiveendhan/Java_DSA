package LeetCode_problem;

public class LC3146 {
        public static int findPermutationDifference(String s, String t) {
            int total=0;
            int sum=0;
            for(int i=0;i<s.length();i++){
                for(int j=0;j<t.length();j++){
                    if(s.charAt(i)==t.charAt(j)){
                        sum=Math.abs(i-j);
                    }
                    total+=sum;
                    sum=0;
                }
            }
            return total;

        }
        public static void main(String[] args) {

            // Test case 1
            String s1 = "bac";
            String t1 = "abc";
            int result1 = findPermutationDifference(s1, t1);
            System.out.println("Permutation difference between " + s1 + " and " + t1 + ": " + result1);

            // Test case 2
            String s2 = "abcd";
            String t2 = "dcba";
            int result2 = findPermutationDifference(s2, t2);
            System.out.println("Permutation difference between " + s2 + " and " + t2 + ": " + result2);
        }
}
