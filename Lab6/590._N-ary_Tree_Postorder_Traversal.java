import java.util.*;
class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root != null) {
            for (Node child : root.children) postorder(child);
            result.add(root.val);
        }
        return result;
    }
}
