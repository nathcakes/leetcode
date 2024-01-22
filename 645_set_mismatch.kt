fun findErrorNums(nums: IntArray): IntArray {
    //Probably faster to use binary search so I need to practice that
    //Maybe implement that tonight
    //According to editorial, using a hashmap is an optimal solution lol

    val sorted = nums.sorted();
    for (i in sorted.indices) {
        if (sorted[i] != i + 1) {
            return intArrayOf(nums[i], i + 1)
        }
    }
    return nums;
}