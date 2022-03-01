package Sword2Offer.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InitTree {
    //返回一个二叉树
    public TreeNode initTreeByArrays(String[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return null;
        }
        List<TreeNode> tempList = new ArrayList<>();
        for (int i = 0; i < arrs.length; i++) {
            if ("#".equals(arrs[i])) {
                tempList.add(null);
            } else {
                TreeNode node = new TreeNode(Integer.parseInt(arrs[i]));
                tempList.add(node);
            }
        }
        for (int i = 0; i < tempList.size() / 2; i++) {
            tempList.get(i).left = 2 * i + 1 <= tempList.size() ? tempList.get(2 * i + 1) : null;
            tempList.get(i).right = 2 * i + 2 <= tempList.size() ? tempList.get(2 * i + 2) : null;
        }
        return tempList.get(0);
    }
    public String[] initStrings() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tempStr = br.readLine();
        String[] strings = tempStr.split(",");
        return strings;
    }

    public static void main(String[] args) throws IOException {
        InitTree initTree = new InitTree();
        String[] strings = initTree.initStrings();
        initTree.initTreeByArrays(strings);
    }
}
