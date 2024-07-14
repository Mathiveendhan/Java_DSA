package Recursion;

public class displayArrElements{
    public static void display(int[] arr,int idx){
        if(idx==arr.length-1){
            System.out.println(arr[idx]);
            return;
        }
        System.out.println(arr[idx]);
        display(arr,idx+1);

    }
    public static void main(String args[]){
        int[] arr={3,8,10,15};
        display(arr,0);
    }
}

// output:
// 3
// 8
// 10
// 15
