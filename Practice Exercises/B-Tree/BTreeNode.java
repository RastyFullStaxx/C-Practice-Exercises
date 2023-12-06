class BTreeNode {
    int[] keys;
    BTreeNode[] children;
    int numKeys;
    boolean isLeaf;

    public BTreeNode(int degree, boolean isLeaf) {
        this.keys = new int[2 * degree - 1];
        this.children = new BTreeNode[2 * degree];
        this.numKeys = 0;
        this.isLeaf = isLeaf;
    }
}
