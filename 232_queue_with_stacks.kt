class MyQueue() {
    
    private val pushStack = ArrayDeque<Int>(0);
    private val popStack = ArrayDeque<Int>(0);
    
    private var front: Int = -1;
    
    fun push(x: Int) {
        while (popStack.isNotEmpty()){
            pushStack.addFirst(popStack.removeFirst());
        }
        pushStack.addFirst(x);
    }

    fun pop(): Int {
        while (pushStack.isNotEmpty()){
            popStack.addFirst(pushStack.removeFirst());
        }
        return popStack.removeFirst();
    }

    fun peek(): Int {
        while (pushStack.isNotEmpty()){
            popStack.addFirst(pushStack.removeFirst());
        }
        return popStack.first();
    }

    fun empty(): Boolean {
        return pushStack.isEmpty() && popStack.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * var obj = MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */