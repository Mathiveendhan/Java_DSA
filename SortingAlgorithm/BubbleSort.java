package SortingAlgorithm;

public class BubbleSort {
    public static void main(String[] args){
        int[] array={3,5,2,7,1,9,4,9};
        int len=array.length;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int top=array[j];
                    array[j]=array[j+1];
                    array[j+1]=top;
                }
            }
        }
        for(int a=0;a<array.length;a++) {
            System.out.print(array[a]+" ");
        }
        System.out.println(" ");
        System.out.print("Bubble sort has been done");
    }
}
