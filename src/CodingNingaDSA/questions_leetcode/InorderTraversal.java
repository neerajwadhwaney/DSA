package CodingNingaDSA.questions_leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode temp = root;
        while(temp!=null || !nodes.isEmpty()){
            while (temp!=null){
                nodes.push(temp);
                temp=temp.left;
            }
            temp=nodes.pop();
            inorder.add(temp.val);
            temp = temp.right;
        }
        return inorder;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode oneRight = new TreeNode(2);
        oneRight.right = null;
        TreeNode twoLeft = new TreeNode(3);
        twoLeft.right = twoLeft.left = null;
        root.right = oneRight;
        oneRight.left = twoLeft;

        System.out.println(inorderTraversal(root));
    }
}
