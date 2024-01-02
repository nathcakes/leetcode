class Solution1897 {
    //I know I can check if it's possible
    //By looping through words and counting the length of each string
    //If it's not evenly divisible by the number of entries
    //I'ts not possible
    //I could make a hashmap counting how much of each character there is
    //If there's the same amount of each character then it can be done otherwise it can't
    fun makeEqual(words: Array<String>): Boolean {
        val charMap = mutableMapOf<Char, Int>();
        for (word in words) {
            for (ch in word) {
                charMap[ch] = charMap.getOrDefault(ch, 0) + 1;
            }
        }
        //println(charMap.values)
        //println(charMap.filterValues { it % words.size != 0 })
        return charMap.filterValues {
            it % words.size != 0;
        }.isEmpty();
    }
}

fun main() {
    val words = arrayOf("abc", "aabc", "bc");
    println(Solution1897().makeEqual(words));
}