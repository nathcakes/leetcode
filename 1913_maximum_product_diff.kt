class Solution1913{
    //My intuition is find the max 2 numbers and the lowest 2 numbers from the array and then return the result
    var max = Int.MIN_VALUE;
    var secondMax = Int.MIN_VALUE;
    var min = Int.MAX_VALUE;
    var secondMin = Int.MAX_VALUE;
    fun maxProductDifference(nums: IntArray): Int {

        //Oh what's happening here is we are putting the min into max but what if the old max was the new min?
        for (num in nums){
            checkNum(num);
            /*when {
                num > max -> {
                    secondMax = max;
                    max = num;
                }
                num > secondMax -> {
                    secondMax = num;
                }
                num < min -> {
                    //secondMin = min;
                    min = num;
                }
                num < secondMin -> {
                    secondMin = num;
                }
                
            //else -> continue;
            }
            */
        }
        println("max: $max , secondMax: $secondMax, min: $min, secondMin: $secondMin")
        return (max * secondMax) - (min * secondMin);
    }

    private fun checkNum(num: Int) {
        if ((num == Int.MAX_VALUE) or (num == Int.MIN_VALUE)){
            return;
        }
        var old = 0;
        when {
            num > max -> {
                old = max;
                max = num;
                checkNum(old);
            }
            num > secondMax -> {
                old = secondMax;
                secondMax = num;
                checkNum(old)
            }
            num < min -> {
                //secondMin = min;
                old = min;
                min = num;
                checkNum(old);
            }
            num < secondMin -> {
                old = secondMin
                secondMin = num;
                checkNum(secondMin)
            }
        }
    }
}

fun main(){
    val test = intArrayOf(4,2,5,9,7,4,8)
    println("Expect 64: Result ${Solution1913().maxProductDifference(test)}")
}