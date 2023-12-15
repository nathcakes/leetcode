class Solution1436 {
    fun destCity(paths: List<List<String>>): String {
        val fromSet: MutableSet<String> = mutableSetOf("");
        for (cityPair in paths){
            fromSet.add(cityPair[0]);
        }
        for (cityPair in paths){
            if (!fromSet.contains(cityPair[1])) return cityPair[1]
        }
        return "";
    }
}