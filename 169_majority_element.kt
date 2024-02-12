import kotlin.math.floor

fun majorityElement(nums: IntArray): Int {
    val target = floor(nums.size / 2.toDouble())
    val count = mutableMapOf<Int, Int>();
    for (num in nums){
        var current = count.getOrDefault(num, 0);
        current = ++current;
        if (current > target){
            return num;
        }
        count[num] = current;
    }
    return -1;
}