fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableListOf<List<String>>();
    val map = mutableMapOf<String, ArrayList<String>>();
    for (str in strs){
        val sortedStr = str.toCharArray().sorted().toString()
        val anagrams = map.getOrDefault(sortedStr, arrayListOf<String>());
        anagrams.add(str);
        map[sortedStr] = anagrams;
    }
    for (anagram in map.values){
        result.add(anagram.toList());
    }
    return result;
}