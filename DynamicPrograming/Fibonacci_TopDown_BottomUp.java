package DynamicPrograming;

public class Fibonacci_TopDown_BottomUp {
        public static int fibTD(int n, int[] arr) {
            if (n == 0 || n == 1) {
                return n;
            }
            if(arr[n] != 0){
                return arr[n];
            }
            int fmn1 = fibTD(n - 1,arr);
            int fmn2 = fibTD(n - 2,arr);
            int fn = fmn1 + fmn2;
            arr[n]=fn;
            return fn;
        }
        public static int fibBU(int n){
            int[] strg=new int[n+1];
            strg[0]=0;
            strg[1]=1;
            for(int i=2;i<=n;i++){
                strg[i]=strg[i-1]+strg[i-2];
            }
            return strg[n];
        }
        public static void main(String[] args){
            int n = 15;
            int[] arr = new int[n+1];
            System.out.println(fibTD(n,arr));
            System.out.println(" ");
            System.out.println(fibBU(n));
        }
}
