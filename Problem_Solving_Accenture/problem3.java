package Problem_Solving_Accenture;

import java.util.*;
public class problem3 {
    public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int col=sc.nextInt();
                int[][] matrix=new int[row][col];
                for(int a=0;a<row;a++){
                    for(int b=0;b<col;b++){
                        matrix[a][b]=sc.nextInt();
                    }
                }
                //0 1 0 1 1 0 1 1 1
                //0 1 0 1 1 0 1 0 1 1 1 1
                int max=0;
                int dum=0;
                for(int i=0;i<row;i++){
                    int count=0;
                    for(int j=0;j<col;j++){
                        if(matrix[i][j]==1){
                            count++;
                        }
                    }
                    if(count>max){
                        max=count;
                        dum=i;
                    }
                }
                System.out.println(dum+1);
    }
}

//
//A parking lot in a mall has R×C number of parking spaces. Each parking space will either be empty (0) or full (1). The status (0/1) of a parking space is represented as the element of the matrix. The task is to find the index of the row (R) in the parking lot that has the most of the parking spaces full (1).
//Note:
//R×C is the size of the matrix.
//Elements of the matrix M should be only 0 or 1.
//Example 1:
//Input:
//text
//3   -> Value of R (row)
//3   -> Value of C (column)
//       [0 1 0
//        1 1 0
//        1 1 1]   -> Elements of the array M[R][C], where each element is separated by a new line.
//
//        Output:
//            3   -> Row 3 has the maximum number of 1's
//
//Example 2:
//Input:
//text
//4   -> Value of R (row)
//3   -> Value of C (column)
//[0 1 0
//        1 0 1
//        1 1 1
//        1 1 1]   -> Elements of the array M[R][C], where each element is separated by a new line.
//
//        Output:
//    3-> Row 3 has the maximum number of 1's
