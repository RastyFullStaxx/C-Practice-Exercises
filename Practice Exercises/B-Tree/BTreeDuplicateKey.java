public class BTreeDuplicateKey {
    public static void main(String[] args) {
        BTreeNode root = buildSampleBTree();
        int keyToInsert = 15;

        root = insert(root, keyToInsert);

        System.out.println("B-Tree after handling duplicate key:");
        printBTree(root);
    }

    public static BTreeNode insert(BTreeNode root, int key) {
        // Implement B-tree insertion algorithm with duplicate key handling
        return root;
    }

    public static void printBTree(BTreeNode root) {
        // Implement B-tree traversal to print the tree
    }

    public static BTreeNode buildSampleBTree() {
        // Helper method to build a sample B-tree for testing
        return null;
    }
}
