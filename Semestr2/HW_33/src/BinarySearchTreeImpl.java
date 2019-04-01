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
        if(find(root, t) == null)
            return false;
        else
            return true;
    }

    public void remove(T t) {
        root = remove(root, t);
    }

    private TreeNode remove(TreeNode root, T t){
        root = find(root, t);
        if(root == null){
            throw new IllegalArgumentException();
        }
        if(root.right == null && root.left == null){
            root = null;
        }
        return root;
    }

    private TreeNode find(TreeNode root, T t){
        if(root == null){
            return null;
        }
        int res = root.value.compareTo(t);
        if(res > 0){
            root = find(root.left, t);
        }
        if(res < 0){
            root = find(root.right, t);
        }
        return root;
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