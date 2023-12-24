import kotlin.math.min

class Solution1758{
    fun minOperations(s: String): Int {
        var startOneCount = 0;
        var startZeroCount = 0;
        var pattern = '0'
//        if (last == '0'){
//            startOneCount++;
//        } else {
//            startZeroCount++;
//        }
        for (ch in s){
            if (ch == pattern){
                startOneCount++;
            } else {
                startZeroCount++;
            }
            if (pattern == '0'){
                pattern = '1'
            } else {
                pattern = '0'
            }
        }
        return min(startOneCount, startZeroCount);
    }
}