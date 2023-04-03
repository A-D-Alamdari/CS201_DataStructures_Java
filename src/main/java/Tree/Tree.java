package Tree;

public class Tree {
    private TreeNode root;

    public Tree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode recursiveSearch(int value) {
        if (root != null) {
            return root.recursiveSearch(value);
        } else {
            return null;
        }
    }

    public TreeNode iterativeSearch(int value) {
        TreeNode temp = root;
        while (temp != null) {
            if (value < temp.getData()) {
                temp = temp.getLeft();
            } else {
                if (value > temp.getData()) {
                    temp = temp.getRight();
                } else {
                    return temp;
                }
            }
        }
        return null;
    }

    public TreeNode iterativeMinSearch() {
        TreeNode temp = root;
        TreeNode parent = null;
        while (temp != null) {
            parent = temp;
            temp = temp.getLeft();
        }
        return parent;
    }

    public TreeNode iterativeMaxSearch() {
        TreeNode temp = root;
        while (temp != null) {
            if (temp.getRight() == null) {
                return temp;
            }
            temp = temp.getRight();
        }
        return null;
    }

    public TreeNode recursiveMinSearch() {
        if (root != null) {
            return root.recursiveMinSearch();
        }
        return null;
    }

    public TreeNode recursiveMaxSearch() {
        if (root != null) {
            return root.recursiveMaxSearch();
        }
        return null;
    }

}
