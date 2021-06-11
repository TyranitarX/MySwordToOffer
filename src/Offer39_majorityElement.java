import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/6/10 9:55
 **/
public class Offer39_majorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> nummap = new HashMap<>();
        for (int num : nums) {
            if (nummap.containsKey(num)) {
                nummap.replace(num, nummap.get(num) + 1);
            } else
                nummap.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : nummap.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
