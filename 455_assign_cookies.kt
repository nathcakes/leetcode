class Solution455{
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        var gSorted = g.sorted();
        var sSorted = s.sorted().toIntArray();
        var content = 0;
        for (child in gSorted){
            for ((idx, cookie) in sSorted.withIndex()){
                if (cookie >= child){
                    sSorted[idx] = -1;
                    content++;
                    break;
                }
            }
        }
        return content;
    }
}