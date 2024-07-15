package LeetCode_problem;

import java.util.*;
public class LC781 {
        public static int numRabbits(int[] answers) {
            Map<Integer, Integer> map = new HashMap<>();
            int rabbits = 0;
            for (int answer : answers) {
                if (!map.containsKey(answer)) {
                    map.put(answer, 1);
                    rabbits += answer + 1;
                } else {
                    map.put(answer, map.get(answer) + 1);
                }
                if (map.get(answer) == answer + 1) {
                    map.remove(answer);
                }
            }
            return rabbits;
        }
    public static void main(String[] args) {
        int[] arr={1,1,2};
        System.out.println(numRabbits(arr));

    }
}

//class Solution {
//    public int numRabbits(int[] answers) {
//        HashSet<Integer> hash=new HashSet<>();
//        int sum=0;
//        for(int i=0;i<answers.length;i++){
//            if(!hash.contains(answers[i])){
//                hash.add(answers[i]);
//                sum=sum+(answers[i]+1);
//            }
//        }
//        return sum;
//    }
//}

