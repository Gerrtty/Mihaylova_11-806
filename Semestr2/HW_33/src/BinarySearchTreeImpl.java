public class BinarySearchTreeImpl<T extends Comparable<T>> implements BinarySearchTree<T> {
    private class TreeNode {
        T value;
        TreeNode left;
        TreeNode right;

        public TreeNode(T value) {
            this.value = value;
        }
    }

    private TreeNode root;

    @Override
    public void insert(T t) { root = insert(root, t); }

    private TreeNode insert(TreeNode root, T t) {
        if (root == null) {
            root = new TreeNode(t);
        }
        else {
            if (root.value.compareTo(t) >= 0) {
                root.left = insert(root.left, t);
            } else {
                root.right = insert(root.right, t);
            }
        }
        return root;
    }

    @Override
    public boolean contains(T t) { return contains(root, t); }

    private boolean contains(TreeNode root, T t){
        if(root == null){
            return false;
        }
        int res = root.value.compareTo(t);
        if(res == 0){
            return true;
        }
        if(res > 0) {
            return contains(root.left, t);
        }
        else {
            return contains(root.right, t);
        }
    }

    public void remove(T t) {
    }

    @Override
    public void printAll() {
        print(root);
    }

    private void print(TreeNode root) {
        if (root != null) {
            print(root.left);
            System.out.println(root.value);
            print(root.right);
        }
    }

    @Override
    public void printAllByLevels() {
    }
}