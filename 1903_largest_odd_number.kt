class Solution {
    fun largestOddNumber(num: String): String {
        for (i in (num.length - 1) downTo 0){
            if (num[i].code % 2 == 1){
                return num.substring(0..i);
            }
        }
        return "";
    }
}
fun main() {
    println(Solution().largestOddNumber("5"))
    println(Solution().largestOddNumber("24"))
    println(Solution().largestOddNumber("42834758123983120057549345843598793455544444668"))
}