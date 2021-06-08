import java.util.*;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/21 9:12
 **/
public class Offer32_III_levelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> myqueue = new LinkedList<>();
        myqueue.add(root);
        while (!myqueue.isEmpty()) {
            LinkedList<Integer> mylist = new LinkedList<>();
            for (int i = myqueue.size(); i > 0; i--) {
                TreeNode now = myqueue.poll();
                mylist.add(now.val);
                if (now.left != null) myqueue.add(now.left);
                if (now.right != null) myqueue.add(now.right);
            }
            if (res.size() % 2 == 1) Collections.reverse(mylist);
            res.add(mylist);
        }
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
        new Offer32_III_levelOrder().levelOrder(treeNode);
    }
}
