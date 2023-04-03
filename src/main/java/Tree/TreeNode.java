package Tree;

public class TreeNode {
    private TreeNode right;
    private TreeNode left;
    private int data;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }
    public TreeNode getRight() {
        return right;
    }
    public int getData() {
        return data;
    }

    public TreeNode recursiveSearch(int value) {
        if (data == value) {
            return this;
        }
        if (value < data) {
            if (left != null) {
                return left.recursiveSearch(value);
            } else {
                return null;
            }
        } else {
            if (right != null) {
                return right.recursiveSearch(value);
            } else {
                return null;
            }
        }
    }

    public TreeNode recursiveMinSearch() {
        if (left == null) {
            return this;
        }
        return left.recursiveMinSearch();
    }

    public TreeNode recursiveMaxSearch() {
        if (right == null) {
            return this;
        }
        return right.recursiveMaxSearch();
    }
}
