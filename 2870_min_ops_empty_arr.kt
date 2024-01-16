import kotlin.math.ceil

fun minOperations(nums: IntArray): Int {
    val intMap = mutableMapOf<Int, Int>()
    var moves = 0;
    for (num in nums) {
        intMap[num] = intMap.getOrDefault(num, 0) + 1;
    }
    for (it in intMap.values) {
        moves += when {
            (it == 1) -> {
                return -1;
            }

            else -> {
                kotlin.math.ceil(it.toDouble() / 3).toInt();
            }
        }
    }
    /*
    for (it in intMap) {
        moves += when {
            (it.value == 1) -> {
                return -1;
            }

            (it.value % 3 == 0) -> {
                kotlin.math.ceil(it.value.toDouble() / 3).toInt();
                it.value / 3;
            }

            it.value % 3

                    == 1
            -> {
                val n = it.value / 3;
                val d = it.value - ((n - 1) * 3);
                (n - 1) + (d / 2);
            }

            (it.value % 3 == 2) -> {
                it.value / 3 + 1;
            }

            else -> return -1;
        }
    }
    */
    return moves;
}