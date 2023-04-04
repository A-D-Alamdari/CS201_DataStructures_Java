package Tree;

import Array.Element;
import Array.Stack;

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

    /**
     * Insert a new element in a sorted binary Tree.
     * @param node The new node to be added to a Tree.
     */
    public void insert(TreeNode node) {
        TreeNode parent = null;
        TreeNode temp = root;
        while (temp != null) {
            parent = temp;
            if (node.getData() < temp.getData()) {
                temp = temp.getLeft();
            } else {
                temp = temp.getRight();
            }
        }
        if (parent == null) {
            root = node;
        } else {
            if (node.getData() < parent.getData()) {
                parent.setRight(node);
            } else {
                parent.setLeft(node);
            }
        }
    }

    public void recursiveInsert(TreeNode node) {
        if (root == null) {
            root = node;
        } else {
            root.recursiveInsert(node);
        }
    }

    public void nodeCountWithStack() {
        TreeNode temp;
        temp = root;
        Stack c = new Stack(100);
        if (temp != null) {
            c.push(new Element(temp));
        }
        while (temp != null) {
            temp = temp.getRight();
            temp = temp.getLeft();
        }
    }
}

