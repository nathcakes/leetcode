class Solution2706 {
    fun buyChoco(prices: IntArray, money: Int): Int{
        var change = money;
        var min = Int.MAX_VALUE;
        var secondMin = Int.MAX_VALUE;
        for (num in prices) {
            if (num < min){
                secondMin = min;
                min = num;
            } else if (num < secondMin){
                secondMin = num;
            }
        }
        if (min + secondMin <= change){
            change = change - min - secondMin;
        }
        return change;
    }
}