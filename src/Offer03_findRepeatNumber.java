public class Offer03_findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        int[] numlist = new int[n];
        for (int i = 0; i < n; i++) {
            numlist[nums[i]] += 1;
        }
        for (int i = 0; i < n; i++) {
            if (numlist[i] > 1)
                return i;
        }
        return -1;
    }
}
