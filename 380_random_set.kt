import kotlin.random.Random

class RandomizedSet(){
    val indexMap = mutableMapOf<Int, Int>();
    val storedVals = mutableListOf<Int>();
    
    fun insert(`val`: Int): Boolean{
        if (indexMap[`val`] != null) return false;
        else {
            indexMap[`val`] = storedVals.size;
            storedVals.add(`val`);
            return true;
        }
    }
    
    fun remove(`val`: Int): Boolean{
        if (indexMap[`val`] == null) return false;
        else {
            val newIndex = indexMap[`val`]!!;
            storedVals[newIndex] = storedVals[storedVals.lastIndex];
            indexMap[storedVals[storedVals.lastIndex]] = newIndex;
            indexMap.remove(`val`);
            storedVals.removeAt(storedVals.lastIndex);
            return true;
        }
    }
    
    fun getRandom(): Int {
        val randomIndex = Random.nextInt(0,storedVals.size)
        return storedVals[randomIndex];
    }
}