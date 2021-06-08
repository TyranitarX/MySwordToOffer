import java.util.LinkedList;
import java.util.Queue;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/6/7 8:42
 **/
public class Offer37_serialize {
    public String serialize(TreeNode root) {
        if (root == null)
            return "[]";
        StringBuilder sb = new StringBuilder("[");
        Queue<TreeNode> myqueue = new LinkedList<>();
        myqueue.offer(root);
        while (!myqueue.isEmpty()) {
            TreeNode node = myqueue.poll();
            if (node != null) {
                sb.append(node.val).append(",");
                myqueue.offer(node.left);
                myqueue.offer(node.right);
            } else {
                sb.append("null,");
            }
//            int size = myqueue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = myqueue.poll();
//                if (node != null) {
//                    sb.append(node.val).append(",");
//                    myqueue.offer(node.left);
//                    myqueue.offer(node.right);
//                } else {
//                    sb.append("null,");
//                }
//            }
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.length() == 2)
            return null;
        String newdata = data.substring(1, data.length() - 1);
        String[] treeserialize = newdata.split(",");
        TreeNode tree = new TreeNode(Integer.parseInt(treeserialize[0]));
        Queue<TreeNode> myQueue = new LinkedList<>();
        myQueue.offer(tree);
        int i = 1;
        while (!myQueue.isEmpty()) {
            TreeNode node = myQueue.poll();
            if (!treeserialize[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(treeserialize[i]));
                myQueue.offer(node.left);
            }
            i++;
            if (!treeserialize[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(treeserialize[i]));
                myQueue.offer(node.right);
            }
            i++;
        }
        return tree;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(5);
        System.out.println(new Offer37_serialize().serialize(node));
    }
}
