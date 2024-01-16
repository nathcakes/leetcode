fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false;
    //Store the characters and counts in maps
    val map1 = mutableMapOf<Char, Int>();
    val map2 = mutableMapOf<Char, Int>();
    //Check that the count of characters is the same in both I think by looping through the keys of 1
    //and check that the counts are equal
    for (i in word1.indices) {
        map1[word1[i]] = map1.getOrDefault(word1[i], 0) + 1;
        map2[word2[i]] = map2.getOrDefault(word2[i], 0) + 1;
    }
    val set1 = map1.keys.toSet();
    val set2 = map2.keys.toSet();
    if (set1 != set2) return false;
    val sorted1 = map1.values.sorted();
    val sorted2 = map2.values.sorted();
    for (i in sorted1.indices) {
        if (sorted1[i] != sorted2[i]) return false;
    }
    return true;
}