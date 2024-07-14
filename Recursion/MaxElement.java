package Recursion;

public class MaxElement {
    static int max=0;
    public static void maxArrElement(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }
        if(max<arr[idx]){
            max=arr[idx];
        }

        maxArrElement(arr,idx+1);
    }
    public static void main(String args[]){
        int[] arr={3,8,10,15};
        maxArrElement(arr,0);
        System.out.println(max);
    }
}
