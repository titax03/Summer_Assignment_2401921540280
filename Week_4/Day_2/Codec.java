
public class Codec {

    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfsSerialize(root, sb);
        return sb.toString();
    }

    private void dfsSerialize(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }

        sb.append(root.val).append(",");
        dfsSerialize(root.left, sb);
        dfsSerialize(root.right, sb);
    }


    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> list = new LinkedList<>(Arrays.asList(arr));
        return dfsDeserialize(list);
    }

    private TreeNode dfsDeserialize(List<String> list) {
        // take first element
        String val = list.remove(0);

        if (val.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));// STR-> INT

        root.left = dfsDeserialize(list);
        root.right = dfsDeserialize(list);

        return root;
    }
}