class Solution2610 {
    fun findMatrix(nums: IntArray): List<List<Int>> {
        //I should improve this code to use arrays instead or improve performance
        val intCount = mutableMapOf<Int, Int>();
        val result: MutableList<MutableList<Int>> = mutableListOf();
        for (num in nums) {
            intCount[num] = intCount.getOrDefault(num, 0) + 1;
        }
        for (i in intCount.keys) {
            var tier = intCount[i]!!;
            while (result.size < tier) {
                //Make a new list
                result.add(mutableListOf());
            }
            while (tier >= 1) {
                result[tier - 1].add(i)
                tier--;
            }
        }
        return result;
    }
}