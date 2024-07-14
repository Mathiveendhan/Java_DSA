package Recursion;

public class sorting_display_duplicate_index {
    static int count=0;
    public static void sortDuplicate(int[] arr,int tar,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==tar){
          System.out.println(idx);
        }
        sortDuplicate(arr,tar,idx+1);

    }
    public static void main(String args[]){
        int[] arr={5,10,12,10,18,30,10};
        int target=10;
        sortDuplicate(arr,target,0);
        //System.out.println((count));
    }
}
/*
//public class Recursion.sorting_display_duplicate_index {
    static int count=0;
    public static int sortDuplicate(int[] arr,int tar,int idx){
        if(idx==arr.length){
            return count;
        }
        if(arr[idx]==tar){
            count=count+1;
        }
        sortDuplicate(arr,tar,idx+1);
        return count;

    }
    public static void main(String args[]){
        int[] arr={5,10,12,10,18,30,10};
        int target=10;
        System.out.println(sortDuplicate(arr,target,0));
    }
}
////output:
//3
*/




