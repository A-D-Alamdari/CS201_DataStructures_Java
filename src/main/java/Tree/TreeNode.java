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

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    /**
     * This function recursively searching for a value inside the Tree
     * @param value The value to be searched
     * @return It returns the TreeNode which is the data is there. If there is not such a value it will return null.
     */
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

    /**
     * This function recursively seeking for the TreeNode which has the minimum value
     * @return TreeNode with minimum value - leftmost node
     */
    public TreeNode recursiveMinSearch() {
        if (left == null) {
            return this;
        }
        return left.recursiveMinSearch();
    }

    /**
     * This function recursively seeking for the TreeNode which has the maximum value
     * @return TreeNode with maximum value - rightmost node
     */
    public TreeNode recursiveMaxSearch() {
        if (right == null) {
            return this;
        }
        return right.recursiveMaxSearch();
    }


    public void preorder() {
        System.out.println(data);
        if (left != null) {
            left.preorder();
        }
        if (right != null) {
            right.preorder();
        }
    }

    public void inorder() {
        if (left != null) {
            left.inorder();
        }
        System.out.println(data);
        if (right != null) {
            right.inorder();
        }
    }

    public void postorder() {
        if (left != null) {
            left.postorder();
        }
        if (right != null) {
            right.postorder();
        }
        System.out.println(data);
    }

    public void prettyPrint(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        System.out.println(data);
        if (left != null) {
            left.prettyPrint(level + 1);
        }
        if (right != null) {
            right.prettyPrint(level + 1);
        }
    }

    public void recursiveInsert(TreeNode node) {
        if (node.getData() < this.data) {
            if (left != null) {
                left.recursiveInsert(node);
            } else {
                left = node;
            }
        } else {
            if (right != null) {
                right.recursiveInsert(node);
            } else {
                right = node;
            }
        }
    }

}
