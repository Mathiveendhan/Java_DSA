package Tree;
import java.util.*;

public class recBinarySearch {
    public static void recursionBinarySearch(int[] sortArr,int start,int end,int target){
        int mid=(start+end)/2;
        if(sortArr[mid]==target){
            System.out.println(sortArr[mid]);
            return;
        }
        if(sortArr[mid]>target) {
            recursionBinarySearch(sortArr,0,mid-1,target);
        }
        if(sortArr[mid]<target){
            recursionBinarySearch(sortArr,mid+1,end,target);
        }
    }
    public static void main(String[] args){
       int[] sortArr={5,10,15,20,25,30,35,40};
       recursionBinarySearch(sortArr,0,sortArr.length-1,35);
    }
}
