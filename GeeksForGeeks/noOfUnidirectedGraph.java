package GeeksForGeeks;

public class noOfUnidirectedGraph {
        static long count(int n) {
            int num=0;
            if(n<2){
                num=0;
            }else{
                num=(n*(n-1))/2;
            }
            long ans = Math.round(Math.pow(2, num));
            return ans;
        }
    public static void main(String[] args) {
          int vertices=6;
          System.out.print(count(vertices));
    }

}
