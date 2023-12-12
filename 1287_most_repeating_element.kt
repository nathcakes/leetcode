class Solution1287 {
    fun findSpecialInteger(arr: IntArray): Int {
        //Brute force is to just loop through and stop once we find size/4 count
        var count = 0;
        val max = arr.size.floorDiv(4);
        for (i in arr.indices) {
            if (i == 0) continue
            if (arr[i] == arr[i - 1]) {
                count++;
                if (count >= max) {
                    return arr[i];
                }
            } else {
                count = 0;
            }
        }
        return arr[0];
        //A more elegant solution would be to break the array into 4 and then binary search it?
    }
}