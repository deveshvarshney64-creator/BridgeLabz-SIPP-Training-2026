public class Scenario6_Postorder {
    void deleteFolderTree(Node node) {
        if (node == null) return;
        deleteFolderTree(node.left);
        deleteFolderTree(node.right);
        deleteNode(node); // safe: both children are already fully deleted
    }
    
    private void deleteNode(Node node) {
        // Safe delete implementation (in context of problem)
        node.left = null;
        node.right = null;
    }
}
