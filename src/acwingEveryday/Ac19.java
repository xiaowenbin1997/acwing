package acwingEveryday;

import java.util.ArrayList;
import java.util.List;

public class Ac19 {
    public TreeNode inorderSuccessor(TreeNode p) {
        if (p.right != null) {
            p = p.right;
            while (p.left != null) {
                p = p.left;
            }
            return p;
        }
        while (p.father != null && p.father.right == p) {
            p = p.father;
        }
        return p.father;
    }
}
