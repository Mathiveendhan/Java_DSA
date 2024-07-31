package GeeksForGeeks;

public class GCD_LCM {
        public static void main(String[] args) {
            Long A = 12L;
            Long B = 18L;
            Long[] result = lcmAndGcd(A, B);

            System.out.println("LCM of " + A + " and " + B + " is: " + result[0]);
            System.out.println("GCD of " + A + " and " + B + " is: " + result[1]);

            Long[] arr = {4L, 7L, 2L, 8L};
            Long minValue = min(arr);
            System.out.println("Minimum value in the array is: " + minValue);
        }
        static Long[] lcmAndGcd(Long A, Long B) {
            Long[] result = new Long[2];

            Long gcd = calculateGCD(A, B);
            result[1] = gcd;

            Long lcm = (A / gcd) * B;
            result[0] = lcm;

            return result;
        }

        static Long calculateGCD(Long a, Long b) {
            while (b != 0) {
                Long temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        static Long min(Long[] arr) {
            Long min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }

}
