class Solution661 {
    fun imageSmoother(img: Array<IntArray>): Array<IntArray> {
        return Array<IntArray> (img.size) {j -> IntArray(img[0].size) {i -> smoother(img, j, i)}}
    }

    fun smoother(img: Array<IntArray>, y: Int, x: Int): Int {
        var tot = 0;
        var count = 0;

        for (j in y - 1 .. y + 1) {
            for (i in x - 1 .. x + 1){
                if (j >= 0 && j < img.size && i >= 0 && i < img[0].size) {
                    tot += img[j][i];
                    count++;
                }
            }
        }

        return tot / count;
    }
}