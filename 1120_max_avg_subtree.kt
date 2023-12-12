class Solution1120 {
    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null;
        var right: TreeNode? = null;
    }

    var maxAverage: Double = 0.toDouble();

    fun maximumAverageSubtree(root: TreeNode?): Double {
        dfs(root);
        return maxAverage;
    }

    fun dfs(node: TreeNode?): Array<Double> {
        if (node == null) {
            return arrayOf(0.toDouble(), 0.toDouble());
        }
        var left = dfs(node.left);
        var right = dfs(node.right);
        var nodeSum = left[0] + right[0] + node.`val`.toDouble();
        var nodeCount = left[1] + right[1] + 1;
        var average = nodeSum / nodeCount;
        maxAverage = maxOf(maxAverage, average);
        return arrayOf(nodeSum, nodeCount);
    }

}