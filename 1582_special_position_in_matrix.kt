class Solution1582 {
    fun numSpecial(mat: Array<IntArray>): Int {
        var sumRows = IntArray(mat[0].size) { 0 }
        var sumCols = IntArray(mat.size) { 0 }
        var count = 0;
        for ((idx, col) in mat.withIndex()) {
            sumCols[idx] = col.sum();
            for ((idx2, row) in col.withIndex()) {
                sumRows[idx2] += row;
            }
        }
        for (col in mat.indices) {
            for (row in mat[0].indices) {
                if (mat[col][row] == 1) {
                    if ((sumRows[row] == 1) and (sumCols[col] == 1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

fun main() {
    val test1 = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 0, 1), intArrayOf(1, 0, 0));
    val test2 = arrayOf(intArrayOf(1, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 1))
    println("Result of T1 = ${Solution1582().numSpecial(test1)}");
    println("Result of T2 = ${Solution1582().numSpecial(test2)}")
}