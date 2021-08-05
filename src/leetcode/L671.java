package leetcode;

class L671 {
    int ans;
    int rootvalue;

    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootvalue = root.val;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (ans != -1 && node.val >= ans) {
            return;
        }
        if (node.val > rootvalue) {
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }

    public static void main(String[] args) {
        L671 sol = new L671();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right= new TreeNode(7);
        System.out.println(sol.findSecondMinimumValue(root));
        System.out.println("***************************************");
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        System.out.println(sol.findSecondMinimumValue(root2));

    }
}










