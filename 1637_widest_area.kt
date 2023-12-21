class Solution1637{
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        var maxDist = 0;
        //sort the x values
        //go through sorted values and give the biggest difference between immediate values
        //Lol kotlin's built in Sort is slowww, I should practice implementing my own sort.
        points.sortWith(compareByDescending { it[0] })
        for (i in 0 ..< points.size - 2){
            val current = points[i][0] - points[i+1][0]
            if (current > maxDist){
                maxDist = current
            }
        }
        return maxDist;
    }
}