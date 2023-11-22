public class MergeBalancedBSTs {
    public static void main(String[] args) {
        TreeNode root1 = buildBalancedBST1();
        TreeNode root2 = buildBalancedBST2();

        TreeNode mergedRoot = mergeBalancedBSTs(root1, root2);

        System.out.println("Inorder traversal of the merged Balanced BST:");
        inorderTraversal(mergedRoot);
    }

    public static TreeNode mergeBalancedBSTs(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        inorderTraversalToList(root1, list1);
        inorderTraversalToList(root2, list2);

        List<Integer> mergedList = mergeSortedLists(list1, list2);

        return sortedListToBST(mergedList, 0, mergedList.size() - 1);
    }

    private static void inorderTraversalToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderTraversalToList(root.left, list);
            list.add(root.data);
            inorderTraversalToList(root.right, list);
        }
    }

    private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i++));
        }

        while (j < list2.size()) {
            result.add(list2.get(j++));
        }

        return result;
    }

    private static TreeNode sortedListToBST(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = sortedListToBST(list, start, mid - 1);
        root.right = sortedListToBST(list, mid + 1, end);

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static TreeNode buildBalancedBST1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        return root;
    }

    public static TreeNode buildBalancedBST2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);
        root.right = new TreeNode(6);

        return root;
    }
}
