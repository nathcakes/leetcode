fun leafSimilar(root1: TreeNode?, root2:TreeNode?): Boolean {
    fun dfs(root: TreeNode?, leaf: ArrayList<Int>){
        if (root == null) return;
        //If we reach a leaf node, add it to the list
        if ((root.left == null) and (root.right == null)){
            leaf.add(root.`val`)
            return;
        }
        //recurse left then right for the correct order for the result
        dfs(root.left, leaf)
        dfs(root.right,leaf)
    }
    //driver code
    val leaf1 = arrayListOf<Int>()
    val leaf2 = arrayListOf<Int>()
    dfs(root1, leaf1);
    dfs(root2, leaf2);
    
    //in kotlin, two lists are equal if they contain the same elements in the same order
    return leaf1 == leaf2;
}