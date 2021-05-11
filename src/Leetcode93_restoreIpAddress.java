import java.util.LinkedList;
import java.util.List;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/11 9:42
 **/

public class Leetcode93_restoreIpAddress {
    List<String> iplist = new LinkedList<>();
    int[] x = new int[4];

    public List<String> restoreIpAddresses(String s) {
        if (s.length() <= 0 || s.length() > 12) return iplist;
        dfs(s, 0, 0);
        return iplist;
    }

    public void dfs(String ori, int s, int count) {
        if (count == 4) {
            if (s == ori.length()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    sb.append(x[i]);
                    if (i != 3)
                        sb.append(".");
                }
                iplist.add(sb.toString());
            }
            return;
        }
        if (s == ori.length()) return;
        if (ori.charAt(s) == '0') {
            x[count] = 0;
            dfs(ori, s + 1, count + 1);
        } else {
            int ip = 0;
            for (int e = s; e < ori.length(); e++) {
                ip = ip * 10 + (ori.charAt(e) - '0');
                if (ip >= 0 && ip <= 255) {
                    x[count] = ip;
                    dfs(ori, e + 1, count + 1);
                } else
                    break;
            }
        }
    }

    public static void main(String[] args) {
        String x = "25525511135";
        new Leetcode93_restoreIpAddress().restoreIpAddresses(x).forEach(System.out::println);
    }
}
