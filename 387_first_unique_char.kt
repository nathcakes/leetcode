import kotlin.math.min

fun firstUniqChar(s: String): Int {
    val map = mutableMapOf<Char, Int>()
    for (ch in s) {
        map[ch] = map.getOrDefault(ch, 0);
    }
    var lowestIdx = Int.MAX_VALUE;
    for ((char, count) in map) {
        if (count == 0) {
            lowestIdx = min(lowestIdx, s.indexOf(char));
        }
    }
    if (lowestIdx == Int.MAX_VALUE) lowestIdx = -1;
    return lowestIdx;
}