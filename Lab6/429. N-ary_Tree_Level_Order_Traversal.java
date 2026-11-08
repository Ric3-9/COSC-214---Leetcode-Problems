class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root != null) traverseLevels(root, 0, result);
        return result;
    }
    private void traverseLevels(Node node, int level, List<List<Integer>> result) {
        if (node == null) return;
        if (level == result.size()) result.add(new ArrayList<>());

        result.get(level).add(node.val);

        if (node.children != null) for (Node child : node.children)traverseLevels(child, level + 1, result);
    }
}
