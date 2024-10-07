package GeeksForGeeks;

public class Count_Inversions {
    static long count=0;
    public static void call(int element,int idx,int[] arr){
        if(idx==arr.length-1){
            return;
        }
        if(element!=arr[idx] && element>arr[idx]){
            count++;
        }
        call(element,idx+1,arr);
    }
    public static void main(String[] args){
        //int[] arr={2,4,1,3,5};
        int[] arr={2, 3, 4, 5, 6};
        for(int i=0;i<arr.length;i++){
            call(arr[i],i,arr);
        }
        System.out.println(count);
    }
}

// class Solution {
//     // arr[]: Input Array
//     // N : Size of the Array arr[]
//     // Function to count inversions in the array.
//     static long inversionCount(long arr[]) {
//         long count=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(i!=j && arr[i]>arr[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
