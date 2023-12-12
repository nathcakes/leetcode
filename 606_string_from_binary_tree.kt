class BTreeSolution {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null;
        var right: TreeNode? = null;
    }

    fun tree2str(root: TreeNode?): String {
        return search(root, StringBuilder()).toString();
    }

    private fun search(root: TreeNode?, builder: StringBuilder): StringBuilder {
        //If we are at the end of the search
        if (root == null) {
            return builder;
        }

        builder.append(root.`val`)

        if (root.left != null) {
            search(root.left, builder.append("(")).append(")")
        } else if (root.right != null ){
            search(root.left, builder.append("(")).append(")")
        }

        if (root.right != null) {
            search(root.right, builder.append("(")).append(")")
        }
        return  builder;
    }
}