class Solution1155{
    val finalModulo = 1000000007;
    //MAX_FACE = min(k, target-n + 1)
    fun numRollsToTarget(n: Int, k: Int, target: Int): Int {
        if (n * k < target){
            return 0;
        }
        
        val dp = Array<IntArray> (n+1) { IntArray(target+1) {0} }
        dp[n][target] = 1;
        var diceIndex = n - 1
        for (row in diceIndex downTo 0){
            for (currentSum in dp[0].indices){
                var ways = 0;
                for (i in 1..minOf(k,target - currentSum)){
                    ways = (ways + dp[row + 1][currentSum + i]) % finalModulo
                }
                dp[row][currentSum] = ways
            }
        }
        return dp[0][0];
    }
}