fun findErrorNums(nums: IntArray): IntArray {
    //Probably faster to use binary search so I need to practice that
    //Maybe implement that tonight
    //According to editorial, using a hashmap is an optimal solution lol
    val map = mutableMapOf<Int, Int>()
    for (num in nums) {
        map[num] = map.getOrDefault(num, 0) + 1;
    }
    var count = 1;
    var missing = 0;
    var dupe = 0;
    for (i in 1..nums.size) {
        if (map.containsKey(i)) {
            if (map[i] == 2) {
                dupe = i;
            }
        } else {
            missing = i;
        }
    }
    return intArrayOf(dupe, missing);
}