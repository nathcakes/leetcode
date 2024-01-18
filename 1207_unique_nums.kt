fun uniqueOccurences(arr: IntArray): Boolean {
    val countMap = mutableMapOf<Int, Int>();
    for (num in arr){
        countMap[num] = countMap.getOrDefault(num, 0) + 1;
    }
    val set = mutableSetOf<Int>();
    for (count in countMap.values){
        if (!set.add(count)){
            return false;
        }
    }
    return true;
}