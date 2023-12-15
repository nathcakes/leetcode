class Solution2482 {
    fun oneMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        var zeroCountRows = IntArray (grid.size) { 0 };
        var oneCountRows = IntArray (grid.size) { 0 };
        var zeroCountCols = IntArray (grid[0].size) { 0 };
        var oneCountCols = IntArray (grid[0].size) { 0 };
        var result = Array<IntArray> (grid.size) { IntArray(grid[0].size) {0} };
        for (row in grid.indices){
            for (col in grid[0].indices){
                when (grid[row][col]){
                    0 -> {
                        zeroCountRows[row]++;
                        zeroCountCols[col]++;
                    }
                    1 -> {
                        oneCountRows[row]++;
                        oneCountCols[col]++;
                    }
                    else -> continue;
                }
            }
        }
        for (row in grid.indices){
            for (col in grid[0].indices){
                result[row][col] = oneCountRows[row] + oneCountCols[col] - zeroCountRows[row] - zeroCountCols[col];
            }
        }
        return result;
    }
}

fun main(){
    var test1 = Array<IntArray> (3) { intArrayOf(0,1,1);intArrayOf(1,0,1); intArrayOf(0,0,1) }
    println(Solution2482().oneMinusZeros(test1).toString());
}