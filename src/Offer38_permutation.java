import java.util.*;


/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/6/8 8:44
 **/
public class Offer38_permutation {
    List<String> res = new ArrayList<>();
    char[] c;

    public String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[0]);
    }

    public void dfs(int i) {
        if (i == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<>();
        for (int j = i; j < c.length; j++) {
            if (!set.contains(c[j])) {
                set.add(c[j]);
                swap(i, j);
                dfs(i + 1);
                swap(i, j);
            }
        }
    }

    void swap(int i, int j) {
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    public static void main(String[] args) {
        String s = "abc";
        Arrays.stream(new Offer38_permutation().permutation(s)).forEach(System.out::println);
    }

}
