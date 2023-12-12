class MatrixSolution {
    fun transpose(matrix: Array<IntArray>): Array<IntArray>{
        val tMatrix = Array (matrix[0].size) {IntArray(matrix.size) {0}}
        for (i in matrix[0].indices){
            for (j in matrix.indices){
                tMatrix[i][j] = matrix[j][i];
            }
        }
        return tMatrix;
    }
}