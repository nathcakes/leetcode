//Come back to this when you're not tired.
fun minSteps(s: String, t: String): Int {
    val sMap = mutableMapOf<Char, Int>();
    val tMap = mutableMapOf<Char, Int>();
    for (i in s.indices) {
        sMap[s[i]] = sMap.getOrDefault(s[i], 0) + 1;
        tMap[t[i]] = tMap.getOrDefault(t[i], 0) + 1;
    }
    var diff = 0;

}