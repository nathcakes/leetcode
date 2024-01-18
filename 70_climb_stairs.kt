fun climbStairs(n: Int): Int {
    val map = mutableMapOf<Int,Int>();
    //Base case
    map[1] = 1;
    map[2] = 2;
    return climbRec(n, map);
}

fun climbRec(n: Int, dp: MutableMap<Int, Int>): Int {
    if (n == 0) return 0;
    if (n in dp.keys) return dp[n]!!;
    dp[n] = climbRec(n-1, dp) + climbRec(n-2, dp)
    return dp[n]!!;
}