class Solution242 {
    fun isAnagram(s: String, t: String): Boolean {
        //Brute force solution is to build a hashmap and check the contents,
        //That takes nLogn I think
        //I'm pretty sure we covered a faster algorithm in class.
        val strMap: MutableMap<Char, Int> = mutableMapOf<Char, Int>();
        for (ch in s){
            var count: Int = strMap.getOrElse(ch) { 0 }
            strMap[ch] = ++count;
        }
        for (ch in t){
            if (strMap[ch] != null){
                if (strMap.getValue(ch) > 1){
                    strMap[ch] = strMap.getValue(ch) - 1;
                } else {
                    strMap.remove(ch);
                }
            }
        }
        return strMap.isEmpty();
    }
}

fun main(){
    val anagram = "anagram";
    val nagaram = "nagaram";
    val rat = "rat";
    val car = "car";
    println("Expect True: ${Solution242().isAnagram(anagram, nagaram)}");
    print("Expect False: ${Solution242().isAnagram(rat,car)}");
}