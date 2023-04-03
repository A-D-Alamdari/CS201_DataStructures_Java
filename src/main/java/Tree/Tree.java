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

    /**
     * Iteratively search for a value inside a Tree.
     * @param value The value to be searched.
     * @return The TreeNode which contain the searched value or null if there is not such a value.
     */
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

    /**
     * Iteratively search for TreeNode which contain minimum value inside it.
     * @return The TreeNode with minimum value, or null if it is empty.
     */
    public TreeNode iterativeMinSearch() {
        TreeNode temp = root;
        TreeNode parent = null;
        while (temp != null) {
            parent = temp;
            temp = temp.getLeft();
        }
        return parent;
    }

    /**
     * Iteratively search for TreeNode which contain maximum value inside it.
     * @return The TreeNode with maximum value, or null if it is empty.
     */
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
