import java.util.*;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/21 8:48
 **/
public class Offer32_II_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> myqueue = new LinkedList<>();
        myqueue.offer(root);
        while (!myqueue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = myqueue.size(); i > 0; i--) {
                TreeNode now = myqueue.poll();
                temp.add(now.val);
                if (now.left != null) myqueue.offer(now.left);
                if (now.right != null) myqueue.offer(now.right);
            }
            res.add(temp);
        }
        res.forEach((mylist) -> mylist.forEach(System.out::println));
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
        new Offer32_II_levelOrder().levelOrder(treeNode);
    }
}
