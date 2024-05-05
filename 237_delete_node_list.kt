import ListNode

fun deleteNode(node: ListNode?) {
    if (node == null) {
        return;
    }
    var currentNode = node;
    var nextNode = node.next!!
    while (nextNode.next != null) {
        currentNode!!.`val` = nextNode.`val`
        currentNode.next = nextNode
        currentNode = nextNode
        nextNode = currentNode.next!!
    }
    currentNode!!.`val` = nextNode.`val`
    currentNode.next = null
}