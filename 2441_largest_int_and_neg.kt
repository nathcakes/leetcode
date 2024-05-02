import kotlin.math.abs

fun findMaxK(nums: IntArray): Int {
    val mutableHashtable = HashMap<Int, Int>();
    var best = -1;
    for (num in nums){
        val check = 0 - num
        if (mutableHashtable.containsKey(check) && abs(check) > best){
            best = abs(check);
        }
        mutableHashtable[num] = 1
    }
    return best;
}