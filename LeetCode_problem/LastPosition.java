package LeetCode_problem;

import java.util.*;
public class LastPosition {
    static ArrayList<Integer> ans=new ArrayList<>();
    public static void main(String[] args){
        int[] arr={5,7,7,8,8,0};
        int target=8;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==target){
                 ans.add(i);
             }
         }
        System.out.print("[");
        System.out.print(ans.get(0));
        System.out.print(",");
        System.out.print(ans.get(ans.size()-1));
        System.out.print("]");

    }
}
