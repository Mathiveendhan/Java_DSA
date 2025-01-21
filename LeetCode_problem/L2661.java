package LeetCode_problem;
public class L2661 {
    public static boolean check(int[][] paint,int rlen,int clen,int r,int c){
        int row=0;
        int column=0;
        for(int i=0;i<clen;i++){
            if(paint[r][i]==1){
                row++;
            }
        }
        for(int j=0;j<rlen;j++){
            if(paint[j][c]==1){
                column++;
            }
        }
            if(row==clen || column==rlen){
                return true;
            }
            return false;
    }
     public static int firstCompleteIndex(int[] arr,int[][] mat){
         int paint[][]=new int[mat.length][mat[0].length];
         int rlen=mat.length;
         int clen=mat[0].length;
          for(int a=0;a<arr.length;a++){
              for(int i=0;i<mat.length;i++){
                  for(int j=0;j<mat[i].length;j++){
                      if(mat[i][j]==arr[a]){
                          paint[i][j]=1;
                          if(check(paint,rlen,clen,i,j)){
                              return a;
                          }
                      }
                  }
              }
          }

        return -1;
     }


   public static void main(String[] args){
//       int[] arr={1,3,4,2};
//       int[][] mat={{1,4},{2,3}};
       int[] arr={2,8,7,4,1,3,5,6,9};
       int[][] mat={{3,2,5},{1,4,6},{8,7,9}};

       System.out.println(firstCompleteIndex(arr,mat));
   }
}
