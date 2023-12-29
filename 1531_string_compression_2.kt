class Solution1531 {
    //Had to get help from neetcode on this one
    fun getLengthOfOptimalCompression(s: String, k: Int): Int {
        var cache = mutableMapOf<ArrayList<Any>, Int>()
        fun count(i: Int, k: Int, prev: Char, prevCnt: Int): Int {
            var currentInput: ArrayList<Any> = arrayListOf(i, k, prev, prevCnt)
            if (cache.contains(currentInput)) {
                return cache[currentInput]!!
            }
            var prevCount = prevCnt
            var result: Int
            if (k < 0) {
                return Int.MAX_VALUE;
            }
            if (i == s.length) return 0
            if (s[i] == prev) {
                var incr = 0;
                if (prevCount in intArrayOf(1, 9, 99)) {
                    incr = 1
                }
                result = incr + count(i + 1, k, s[i], prevCount++);
            } else {
                //Delete
                result = minOf(count(i + 1, k - 1, prev, prevCount), count(i + 1, k, s[i], 1));
                //Don't Delete
            }
            cache[currentInput] = result;
            return result;
        }
        return count(0, k, Char.MIN_VALUE, 0)
    }

}
