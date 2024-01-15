/*
You are given an integer array matches where matches[i] = [winneri, loseri] indicates that the player winneri defeated player loseri in a match.

Return a list answer of size 2 where:

answer[0] is a list of all players that have not lost any matches.
answer[1] is a list of all players that have lost exactly one match.
The values in the two lists should be returned in increasing order.

Note:

You should only consider the players that have played at least one match.
The testcases will be generated such that no two matches will have the same outcome.
 */

fun findWinners(matches: Array<IntArray>): List<List<Int>> {
    val playerMap = mutableMapOf<Int, Int>();
    for (match in matches) {
        playerMap[match[1]] = playerMap.getOrDefault(match[1], 0) + 1;
        if (playerMap[match[0]] == null) playerMap[match[0]] = 0;
    }
    val winnerList = playerMap.mapNotNull {
        if (it.value == 0) it.key else null
    }.sorted()
    val loserList = playerMap.mapNotNull {
        if (it.value == 1) it.key else null
    }.sorted()
    return listOf(winnerList, loserList);

}