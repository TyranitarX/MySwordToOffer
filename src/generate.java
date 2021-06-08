import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/21 15:55
 **/
public class generate {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        new generate().generate(2, 0);
        System.out.println(list);
    }

    public void generate(int tag, int cur) {
        if (cur == tag) {
            List<Integer> mylist = new ArrayList<>(stack);
            list.add(mylist);
            return;
        }

        for (int i = 0; i < tag; i++) {
            stack.add(i);
            generate(tag, cur + 1);
            stack.pop();
        }
    }
}
