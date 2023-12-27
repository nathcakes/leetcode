import kotlin.math.max

class Solution159{
    fun lengthOfLongestSubstringTwoDistinct(s: String): Int {
        if (s.length < 3) return s.length;
        val charMap = mutableMapOf<Char,Int>()
        var maxLength = 2;
        var i = 0; var j = 0;
        while (j < s.length){
            charMap[s[j]] = j++
            if (charMap.size == 3){
                val delIdx = charMap.values.min();
                charMap.remove(s[delIdx]);
                i = delIdx + 1;
            }
            maxLength = max(maxLength, j - i)
        }
        return maxLength
    }
}