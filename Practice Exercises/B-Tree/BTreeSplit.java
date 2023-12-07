public class BTreeSplit {
    public static void main(String[] args) {
        BTreeNode root = buildSampleBTree();
        int keyToInsert = 25;

        root = insert(root, keyToInsert);

        System.out.println("B-Tree after split operation:");
        printBTree(root);
    }

    public static BTreeNode insert(BTreeNode root, int key) {
        // Implement B-tree insertion algorithm with split operation
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
