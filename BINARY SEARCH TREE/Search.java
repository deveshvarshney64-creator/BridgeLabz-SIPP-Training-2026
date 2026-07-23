public class Search {
    boolean search(Node root, int target) {
        Node current = root;
        while (current != null) {
            if (target == current.val) return true;
            current = (target < current.val) ? current.left : current.right;
        }
        return false;
    }
}
