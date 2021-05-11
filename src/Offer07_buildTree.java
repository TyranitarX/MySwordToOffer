import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/8 8:59
 **/

public class Offer07_buildTree {
    Map<Integer, Integer> indexmap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            indexmap.put(inorder[i], i);
        }
        return generate(preorder, 0, preorder.length - 1, 0);
    }

    public TreeNode generate(int[] preorder, int s, int e, int curr) {
        if (s > e)
            return null;
        TreeNode root = new TreeNode(preorder[curr]);
        int currinorder = indexmap.get(preorder[curr]);
        int leftlen = currinorder - s;
        root.left = generate(preorder, s, currinorder - 1, curr + 1);
        root.right = generate(preorder, currinorder + 1, e, curr + leftlen + 1);
        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = new Offer07_buildTree().buildTree(preorder, inorder);
    }
}
