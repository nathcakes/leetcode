fun frequencySort(s: String): String {
    val map = mutableMapOf<Char, ArrayList<Char>>();
    val stringBuilder = StringBuilder()
    for (ch in s){
        val currentList = map.getOrDefault(ch, arrayListOf());
        currentList.add(ch);
        map[ch] = currentList;
    }
    val sortedResult = map.values.sortedByDescending { it.size };
    for (list in sortedResult){
        stringBuilder.append(list.joinToString(""))        
    }
    return stringBuilder.toString();
}