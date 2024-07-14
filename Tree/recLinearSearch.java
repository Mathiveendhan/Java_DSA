package Tree;
import java.util.*;

public class recLinearSearch {
    public static void recursionLinearSearch(int[] sortArr,int idx,int target){
        if(sortArr[idx]==target){
            System.out.println(sortArr[idx]);
            return;
        }
        if(idx==sortArr.length-1){
            System.out.println("value not found");
            return;
        }
        recursionLinearSearch(sortArr,idx+1,target);
        }

    public static void main(String[] args){
        int[] sortArr={5,10,15,20,25,30,35,40};
        recursionLinearSearch(sortArr,0,35);
        recursionLinearSearch(sortArr,0,38);
    }
}

