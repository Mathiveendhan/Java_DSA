package Graph;
import java.util.*;

public class Flood_Fill {
    static Queue<Pair> q = new LinkedList<>();
    static Queue<Pair> q1 = new LinkedList<>();
    static class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }
    public static int[][] travel(int[][] image,int sr,int sc,int color){
        int n = image.length;
        int m = image[0].length;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};
        q.add(new Pair(sr,sc));
        image[sr][sc]=color;
        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            q1.add(q.remove());
            for (int a = 0; a < 4; a++) {
                int nrow = r + drow[a];
                int ncol = c + dcol[a];
               if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol]!=color && image[nrow][ncol]==sc){
                   q.add(new Pair(nrow,ncol));
                   image[nrow][ncol]=color;
               }
            }
        }
        return image;
    }

    public static void main(String[] args){
        int[][] image = {{0,0,0},{0,0,0}};
        int sr=1,sc=0,color=2;
        int[][] ans=travel(image,sr,sc,color);
        for(int j=0;j<ans.length;j++){
            for(int i=0;i< ans.length;i++){
                System.out.print(ans[j][i]+" ");
            }
            System.out.println();

        }

    }
}
