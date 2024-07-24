package HashMap;

import java.util.*;
public class DivideArrayIntoEqual {
        public static boolean divideArray(int[] nums) {
            ArrayList<Integer> arr=new ArrayList<>();
            for(int o:nums){
                arr.add(o);
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<nums.length;j++){
                if(!map.containsKey(nums[j])){
                    map.put(nums[j],1);
                }else if(map.containsKey(nums[j])){
                    map.put(nums[j],map.get(nums[j])+1);
                }
            }
            int count=1;
            for(int i=0;i<arr.size();i++){
                if(map.get(arr.get(i))%2==0){
                    count++;
                }
            }
            return count/2 == (nums.length / 2);
        }

    public static void main(String[] args) {
        int[] nums={3,2,3,2,2,2};
        System.out.println(divideArray(nums));
    }

}