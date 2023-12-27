class Solution1578{
    fun minCost(colors: String, neededTime: IntArray): Int {
        var totalTime = 0;
        var i = 0; var j = 0;
        while (i < neededTime.size && j < neededTime.size){
            var currentTotal =0; var currentMax = 0;
            
            //Find all the baloons with the same color as i
            //Record the total removal time and the maximum removal time
            while (j < neededTime.size && colors[i] == colors[j]){
                currentTotal += neededTime[j]
                currentMax = maxOf(currentMax, neededTime[j])
                j++
            }
            //Now we are at the end of a matching group, we add the cost to the total and update the base
            totalTime += currentTotal - currentMax;
            i = j;
        }
        return totalTime;
    }
}