import kotlin.math.abs
import kotlin.math.max

var maxDistance = 0;

fun amountOfTime(root: TreeNode?, start: Int): Int {
    // I have a feeling the answer is the largest distance between the infected node and the furthest leaf
    traverseTree(root, start);
    return maxDistance;
}

fun traverseTree(root: TreeNode?, start: Int): Int {
    var depth = 0;
    if (root == null) return depth;
    var leftDepth = traverseTree(root.left, start);
    var rightDepth = traverseTree(root.right, start);

    if (root.`val` == start) {
        maxDistance = maxOf(leftDepth, rightDepth);
        depth = -1;
    } else if ((leftDepth >= 0) and (rightDepth >= 0)) {
        depth = maxOf(leftDepth, rightDepth) + 1;
    } else {
        val distance = abs(leftDepth) + abs(rightDepth);
        maxDistance = maxOf(maxDistance, distance);
        depth = minOf(leftDepth, rightDepth) - 1;
    }
    return depth;
}