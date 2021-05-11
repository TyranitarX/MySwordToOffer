import java.util.Arrays;


/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/7 19:33
 **/
public class QuickSort {
    public int[] quickSort(int start, int end, int[] nums) {
        int sign = nums[start];
        boolean rightjud = true;
        int left = start;
        int right = end;
        while (left < right) {
            if (rightjud) {
                while (nums[right] > sign && right > left) {
                    right--;
                }
                nums = swap(left, right, nums);
                rightjud = false;
            } else {
                while (nums[left] < sign && right > left) {
                    left++;
                }
                nums = swap(left, right, nums);
                rightjud = true;
            }
        }
        if (left != start && right != end) {
            nums = quickSort(start, left - 1, nums);
            nums = quickSort(left + 1, end, nums);
        }
        return nums;
    }

    public int[] swap(int left, int right, int[] nums) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        return nums;
    }

    public static void main(String[] args) {
        int nums[] = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        Arrays.stream(new QuickSort().quickSort(0, nums.length - 1, nums)).forEach(System.out::println);
    }
}
