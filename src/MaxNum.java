import java.util.Arrays;


/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/13 10:30
 **/
public class MaxNum {
    public String solve(int[] nums) {
        Integer[] numm = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numm, (a, b) -> {
            String as = String.valueOf(a);
            String bs = String.valueOf(b);
            return (bs + as).compareTo(as + bs);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(numm[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1, 10};
        System.out.println(new MaxNum().solve(nums));
    }
}
