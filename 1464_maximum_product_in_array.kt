class Solution1464 {
    fun maxProduct(nums: IntArray): Int {
        //base case
        if (nums.size == 2) return (nums[0] - 1) * (nums[1] - 1);
        //I think I do 2 pointers to find the two highest values? Then return that.
        var maxValue = 0;
        var secondMax = 0;
        for (num in nums) {
            if (num > maxValue) {
                secondMax = maxValue;
                maxValue = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }
        return (maxValue - 1) * (secondMax - 1)
    }
}

fun main() {
    val nums1 = intArrayOf(3, 4, 5, 2);
    val nums2 = intArrayOf(1, 5, 4, 5);
    val nums3 = intArrayOf(3, 7);

    println("Case 1, Expect 12, Result: ${Solution1464().maxProduct(nums1)}")
    println("Case 2, Expect 16, Result: ${Solution1464().maxProduct(nums2)}")
    println("Case 3, Expect 12, Result: ${Solution1464().maxProduct(nums3)}")

}