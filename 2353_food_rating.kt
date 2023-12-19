class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {
    
    private val foodWithRating: MutableMap<String, Int> = mutableMapOf();
    private val foodWithCuisine: MutableMap<String, String> = mutableMapOf();
    private val bestFoodByCuisine: MutableMap<String, String> = mutableMapOf();
   
    init {
        for (i in foods.indices){
            foodWithRating[foods[i]] = ratings[i]
            foodWithCuisine[foods[i]] = cuisines[i]
            if (bestFoodByCuisine[cuisines[i]] == null){
                bestFoodByCuisine[cuisines[i]] = foods[i]
            } else {
                if (ratings[i] > foodWithRating[bestFoodByCuisine[cuisines[i]]]!!){
                     bestFoodByCuisine[cuisines[i]] = foods[i]
                } else if ((ratings[i] == foodWithRating[bestFoodByCuisine[cuisines[i]]]!!) and (foods[i].compareTo(bestFoodByCuisine[cuisines[i]]!!) < 0)){
                    bestFoodByCuisine[cuisines[i]] = foods[i]
                }
            }
        }
    }


    fun changeRating(food: String, newRating: Int){
        if (newRating > foodWithRating[bestFoodByCuisine[foodWithCuisine[food]]]!!){
            bestFoodByCuisine[foodWithCuisine[food]!!] = food
            foodWithRating[food] = newRating
        } else if ((newRating == foodWithRating[bestFoodByCuisine[foodWithCuisine[food]]]!!) and (food.compareTo(bestFoodByCuisine[foodWithCuisine[food]!!]!!) < 0 )){
            bestFoodByCuisine[foodWithCuisine[food]!!] = food
            foodWithRating[food] = newRating
        } else if ((bestFoodByCuisine[foodWithCuisine[food]!!]!! == food) and (foodWithRating[food]!! > newRating)){
            foodWithRating[food] = newRating
            val newBest = checkCuisine(foodWithCuisine[food]!!)
            bestFoodByCuisine[foodWithCuisine[food]!!] = newBest;
        } else {
            foodWithRating[food] = newRating;
        }
        

    }

    fun highestRated(cuisine: String): String{
        return bestFoodByCuisine[cuisine]!!
    }
    
    private fun checkCuisine(cuisine: String): String {
        var bestFood = bestFoodByCuisine[cuisine]!!
        var bestRating = foodWithRating[bestFood]!!
        foodWithCuisine.map {
            if (it.value == cuisine){
                if (foodWithRating[it.key]!! > bestRating){
                    bestFood = it.key;
                    bestRating = foodWithRating[it.key]!!
                } else if ((foodWithRating[it.key]!! == bestRating) and (it.key.compareTo(bestFood) < 0)){
                    bestFood = it.key
                    bestRating = foodWithRating[it.key]!!
                }
            }
        }
        return bestFood;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * var obj = FoodRatings(foods, cuisines, ratings)
 * obj.changeRating(food,newRating)
 * var param_2 = obj.highestRated(cuisine)
 */