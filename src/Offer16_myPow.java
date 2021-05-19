import java.util.HashMap;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/13 9:44
 **/
public class Offer16_myPow {
    public double myPow(double x, int n) {
        if (x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            if ((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Offer16_myPow().myPow(2.0,10));
    }
}
