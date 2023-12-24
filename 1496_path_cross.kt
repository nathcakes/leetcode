class Solution1496{
    private val visited = mutableSetOf<Pair<Int,Int>>()
    fun isPathCrossing(path: String): Boolean {
        var last = Pair(0,0);
        var duplicate = false;
        visited.add(last);
        for (ch in path){
            when {
                ch == 'N' -> {
                    last = Pair(last.first, last.second + 1);
                    duplicate = isVisited(last)
                    visited.add(last);
                }
                ch == 'E' -> {
                    last = Pair(last.first + 1, last.second);
                    duplicate = isVisited(last)
                    visited.add(last);
                }
                ch == 'S' -> {
                    last = Pair(last.first, last.second - 1);
                    duplicate = isVisited(last)
                    visited.add(last);
                }
                ch == 'W' -> {
                    last = Pair(last.first - 1, last.second);
                    duplicate = isVisited(last)
                    visited.add(last);
                }
            }
            if (duplicate) return true
        }
        return false;
    }
    private fun isVisited(point: Pair<Int,Int>): Boolean{
        return if (visited.contains(point)){
            true;
        } else {
            false;
        }
    }
}