class Solution1624{
    fun maxLengthBetweenEqualCharacters(s: String): Int{
        var max = -1;
        val indexMap = mutableMapOf<Char, Int>() //Char - first index
        for ((idx, ch) in s.withIndex()){
            if (indexMap[ch] != null){
                val dist = idx - indexMap[ch]!! - 1;
                max = maxOf(max, dist);
            } else {
                indexMap[ch] = idx;
            }
        }
        return max;
    } 
}


