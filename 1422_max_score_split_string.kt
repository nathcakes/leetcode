class Solution1422{
    fun maxScore(s: String): Int{
        //Honestly I wasn't in the mood so i just took this solution after reading about it.
        //I should try again soon.
        val c = s.toCharArray()

        var ones = c.fold(0) { acc, v ->  if(v == '1') acc + 1 else acc } 
        var zeros = if(c[0] == '1') {
            ones--
            0
        } else {
            1
        }

        var max = ones + zeros

        for(i in 1..c.size-2) {
            if(c[i] == '0'){
                zeros++
                if(ones + zeros > max) max = ones + zeros
            } else {
                ones--
            }
        }

        return max
    }

}