/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/12 8:42
 **/
public class Offer14_cuttingRope {
    public int cuttingRope(int n) {
        long[] cut = new long[n + 1];
        cut[0] = 0;
        cut[1] = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i / 2; j++) {
                cut[i] = Math.max(cut[i], Math.max(j * cut[i - j], j * (i - j)));
            }
        }
        return (int)(cut[n]%1000000007);
    }
}
