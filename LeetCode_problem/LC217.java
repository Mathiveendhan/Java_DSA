package LeetCode_problem;

import java.util.*;
public class LC217 {
    public static void main(String[] args){
     HashSet<Integer> q=new HashSet<>();
     int[] arr={1,2,3,4,1,1};
     int count=0;
     for(int i=0;i<arr.length;i++){
         if(q.contains(arr[i])){
             System.out.println("true");
             count++;
             break;
         }
         q.add(arr[i]);
     }
     if(count<1){
         System.out.println("false");
     }
    }
}
