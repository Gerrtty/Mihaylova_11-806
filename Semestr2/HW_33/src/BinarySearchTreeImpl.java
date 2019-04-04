import java.util.LinkedList;

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
    public void insert(T t) {
        root = insert(root, t);
    }

    private TreeNode insert(TreeNode root, T t) {
        if (root == null) {
            root = new TreeNode(t);
        } else {
            if (root.value.compareTo(t) >= 0) {
                root.left = insert(root.left, t);
            } else {
                root.right = insert(root.right, t);
            }
        }
        return root;
    }

    @Override
    public boolean contains(T t) {
        return contains(root, t);
    }

    private boolean contains(TreeNode root, T t) {
        return find(root, t) != null;
    }

    public void remove(T t) {
        remove(root, t);
    }

    private void remove(TreeNode root, T t) {
        TreeNode parent = findParent(root, t);
        TreeNode current = find(root, t);
        if (parent != null) {
            // Если обоих детей нет, то удаляем текущий узел и обнуляем ссылку на него у родительского узла
            if (current.right == null && current.left == null) {
                if (parent.right != null && parent.right.value.equals(current.value)) {
                    parent.right = null;
                }
                else if(parent.left != null && parent.left.value.equals(current.value)){
                    parent.left = null;
                }
            }
            // Если одного из детей нет
            else if (current.right == null) {
                if (parent.right.value.equals(current.value)) {
                    parent.right = current.left;
                }
                else parent.left = current.left;
            }
            else if (current.left == null) {
                if (parent.right.value.equals(current.value)) {
                    parent.right = current.right;
                }
                else parent.left = current.right;
            }
            else {
                // Если отсутствует левый узел правого поддерева (n->right->left)
                if (current.right.left == null) {
                    TreeNode newNode = current.right;
                    newNode.right = current.right.right;
                    newNode.left = current.left;
                    if (parent.right.value.equals(current.value)) {
                        parent.right = newNode;
                    } else {
                        parent.left = newNode;
                    }
                }
                else {
                    TreeNode newNode = findLastChild(current); // Самый левый узел правого поддерева
                    TreeNode parentNewNode = findParent(root, newNode.value);
                    parentNewNode.left = null;
                    newNode.right = current.right;
                    newNode.left = current.left;
                    if (parent.right.value.equals(current.value)) {
                        parent.right = newNode;
                    }
                    else {
                        parent.left = newNode;
                    }
                }
            }
        }
        // Если удаляемый узел - корень дерева
        else {
            TreeNode newRoot = findNewRoot(current);
            TreeNode parentNewRoot = findParent(root, newRoot.value);
            parentNewRoot.right = null;
            newRoot.right = current.right;
            newRoot.left = current.left;
        }
    }

    private TreeNode findNewRoot(TreeNode node){
        TreeNode treeNode = node.left;
        while (treeNode.right != null){
            treeNode = treeNode.right;
        }
        return treeNode;
    }

    private TreeNode findLastChild(TreeNode node){
        TreeNode treeNode = node.right;
        while (treeNode.left != null){
            treeNode = treeNode.left;
        }
        return treeNode;
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

    private TreeNode findParent(TreeNode root, T t){
        TreeNode parent = root;
        if(root == null){
            return null;
        }
        int res = root.value.compareTo(t);
        if(res > 0){
            if(parent.right != null && parent.right.value.compareTo(t) == 0 || parent.left != null && parent.left.value.compareTo(t) == 0){
                return parent;
            }
            else parent = findParent(root.left, t);
        }
        if(res < 0){
            if(parent.right != null && parent.right.value.compareTo(t) == 0 || parent.left != null && parent.left.value.compareTo(t) == 0){
                return parent;
            }
            else parent = findParent(root.right, t);
        }
        return parent;
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
        LinkedList<TreeNode> q = new LinkedList<>();
        if(root == null){
            return;
        }
        q.add(root);
        while (!q.isEmpty()){
            TreeNode t = q.poll();
            System.out.print(t.value + " ");
            if(t.left != null){
                q.add(t.left);
            }
            if(t.right != null){
                q.add(t.right);
            }
        }
    }
}