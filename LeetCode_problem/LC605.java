package LeetCode_problem;

public class LC605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 &&
                    (i == 0 || flowerbed[i - 1] == 0) &&
                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                n--;
                i++;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flower={1,0,0,0,1};
        int n=1;
        boolean ans=canPlaceFlowers(flower,n);
        System.out.println(ans);
    }
}
