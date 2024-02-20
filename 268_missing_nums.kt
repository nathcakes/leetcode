fun missingNumber(nums: IntArray): Int {
    val count = mutableMapOf<Int,Int>();
    for (num in nums){
        count[num] = 1;
    }
    for (num in 0..nums.size){
        if (count[num] == null) return num;        
    }
    return -1;
}