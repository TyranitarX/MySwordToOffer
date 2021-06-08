import java.util.Stack;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/20 8:50
 **/
public class Offer31_validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int i : pushed) {
            stack.push(i);
            while (!stack.isEmpty() && popped[j] == stack.peek()) {
                j++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed = {8, 9, 2, 3, 7, 0, 5, 4, 6, 1};
        int[] popped = {6, 8, 2, 1, 3, 9, 0, 7, 4, 5};
        System.out.println(new Offer31_validateStackSequences().validateStackSequences(pushed, popped));
    }
}
