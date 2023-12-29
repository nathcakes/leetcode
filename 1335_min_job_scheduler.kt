class Solution1335 {
    fun minDifficulty(jobDifficulty: IntArray, d: Int): Int {
        if (jobDifficulty.size < d) return -1;
        fun dfs(i: Int, d: Int, curMax: Int): Int {
            var current = curMax;
            if (i == jobDifficulty.size) {
                if (d == 0) return 0;
                else return Int.MAX_VALUE;
            }
            if (d == 0) return Int.MAX_VALUE;

            current = maxOf(current, jobDifficulty[i]);

            var result = minOf(dfs(i + 1, d, current), // continue day
                    dfs(i + 1, d - 1, -1) // finish day
            )
            return result;
        }

        return dfs(0, d, -1);
    }
}