fun numberOfBeams(bank: Array<String>): Int {
    var sum = 0;
    var prev = 0;
    for (str in bank) {
        val deviceCount = str.map {
            when (it) {
                '0' -> 0;
                '1' -> 1;
                else -> -1
            }
        }.sum();
        if (deviceCount > 0) {
            sum += prev * deviceCount;
            prev = deviceCount;
        }
    }
    return sum;
}