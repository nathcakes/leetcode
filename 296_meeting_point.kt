import kotlin.math.abs

class Solution296{
    fun minTotalDistance(grid: Array<IntArray>): Int{
        var xValues = arrayListOf<Int>();
        var yValues = arrayListOf<Int>();
        for (i in grid.indices){
            for (j in grid[0].indices){
                xValues.add(j);
                yValues.add(i);
            }
        }
        
    }

    fun manHattanDistance(p1:IntArray, p2:IntArray): Int{
        return abs(p2[0] - p1[0]) + abs(p2[1] - p1[1])
    }
    
    //got tired, should try to finish my implementation then understand the DP solution.
    
    //fun findMedian
}