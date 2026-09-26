import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class addon257 {

    static void findPaths(TreeNode root, String path, List<String> result) {

        if (root == null) {
            return;
        }

        if (path.equals("")) {
            path = "" + root.val;
        } else {
            path = path + "->" + root.val;
        }

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        findPaths(root.left, path, result);
        findPaths(root.right, path, result);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = new ArrayList<>();

        findPaths(root, "", result);

        System.out.println(result);
    }
}