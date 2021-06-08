import java.util.*;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/20 9:27
 **/

public class Offer32_levelOrder {
    public int[] levelOrder(TreeNode root) {
        if (root == null)
            return new int[0];
        List<Integer> array = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode now = queue.poll();
            array.add(now.val);
            if (now.left != null) queue.offer(now.left);
            if (now.right != null) queue.offer(now.right);
        }
        int[] res = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            res[i] = array.get(i);
        }
        array.forEach(System.out::println);
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        new Offer32_levelOrder().levelOrder(treeNode);
    }
}
