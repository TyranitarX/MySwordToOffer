/**
 * @description:
 * @author: Tyranitar
 * @date: 2021/5/19 9:23
 **/
public class Offer26_isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return frontTreverse(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean frontTreverse(TreeNode A, TreeNode B) {
        if (B == null)
            return true;
        if (A == null)
            return false;
        return A.val == B.val && frontTreverse(A.left, B.left) && frontTreverse(A.right, B.right);
    }
}
